package typings.reactMedia.mod

import typings.react.mod.ReactNode
import typings.std.Partial
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-media.react-media.BaseProps & {  queries :Queries,   defaultMatches :std.Partial<react-media.react-media.QueryResults<Queries>> | undefined,   children :(matches : react-media.react-media.QueryResults<Queries>): react.react.ReactNode | react.react.ReactNode | undefined,   onChange :(matches : react-media.react-media.QueryResults<Queries>): void | undefined} */
@js.native
trait MultiQueryProps[Queries] extends js.Object {
  var children: js.UndefOr[(js.Function1[/* matches */ QueryResults[Queries], ReactNode]) | ReactNode] = js.native
  var defaultMatches: js.UndefOr[Partial[QueryResults[Queries]]] = js.native
  var onChange: js.UndefOr[js.Function1[/* matches */ QueryResults[Queries], Unit]] = js.native
  var queries: Queries = js.native
  var render: js.UndefOr[js.Function0[ReactNode]] = js.native
  var targetWindow: js.UndefOr[Window] = js.native
}

object MultiQueryProps {
  @scala.inline
  def apply[Queries](queries: Queries): MultiQueryProps[Queries] = {
    val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiQueryProps[Queries]]
  }
  @scala.inline
  implicit class MultiQueryPropsOps[Self <: MultiQueryProps[_], Queries] (val x: Self with MultiQueryProps[Queries]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQueries(value: Queries): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenFunction1(value: /* matches */ QueryResults[Queries] => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: (js.Function1[/* matches */ QueryResults[Queries], ReactNode]) | ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDefaultMatches(value: Partial[QueryResults[Queries]]): Self = this.set("defaultMatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultMatches: Self = this.set("defaultMatches", js.undefined)
    @scala.inline
    def setOnChange(value: /* matches */ QueryResults[Queries] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setRender(value: () => ReactNode): Self = this.set("render", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    @scala.inline
    def setTargetWindow(value: Window): Self = this.set("targetWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetWindow: Self = this.set("targetWindow", js.undefined)
  }
  
}

