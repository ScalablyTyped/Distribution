package typings.reactRelay.entryPointTypesMod

import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.reactRelay.reactRelayStrings.entryPoints
import typings.reactRelay.reactRelayStrings.extraProps
import typings.reactRelay.reactRelayStrings.queries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  entryPoints :react.react.<global>.JSX.LibraryManagedAttributes<TEntryPointComponent, 'entryPoints'>,   extraProps :react.react.<global>.JSX.LibraryManagedAttributes<TEntryPointComponent, 'extraProps'>, getComponent (): TEntryPointComponent,   queries :react.react.<global>.JSX.LibraryManagedAttributes<TEntryPointComponent, 'queries'>}> */
@js.native
trait PreloadedEntryPoint[TEntryPointComponent] extends js.Object {
  val entryPoints: LibraryManagedAttributes[TEntryPointComponent, typings.reactRelay.reactRelayStrings.entryPoints] = js.native
  val extraProps: LibraryManagedAttributes[TEntryPointComponent, typings.reactRelay.reactRelayStrings.extraProps] = js.native
  val getComponent: js.Function0[TEntryPointComponent] = js.native
  val queries: LibraryManagedAttributes[TEntryPointComponent, typings.reactRelay.reactRelayStrings.queries] = js.native
}

object PreloadedEntryPoint {
  @scala.inline
  def apply[TEntryPointComponent](
    entryPoints: LibraryManagedAttributes[TEntryPointComponent, entryPoints],
    extraProps: LibraryManagedAttributes[TEntryPointComponent, extraProps],
    getComponent: () => TEntryPointComponent,
    queries: LibraryManagedAttributes[TEntryPointComponent, queries]
  ): PreloadedEntryPoint[TEntryPointComponent] = {
    val __obj = js.Dynamic.literal(entryPoints = entryPoints.asInstanceOf[js.Any], extraProps = extraProps.asInstanceOf[js.Any], getComponent = js.Any.fromFunction0(getComponent), queries = queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadedEntryPoint[TEntryPointComponent]]
  }
  @scala.inline
  implicit class PreloadedEntryPointOps[Self <: PreloadedEntryPoint[_], TEntryPointComponent] (val x: Self with PreloadedEntryPoint[TEntryPointComponent]) extends AnyVal {
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
    def setEntryPoints(value: LibraryManagedAttributes[TEntryPointComponent, entryPoints]): Self = this.set("entryPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtraProps(value: LibraryManagedAttributes[TEntryPointComponent, extraProps]): Self = this.set("extraProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetComponent(value: () => TEntryPointComponent): Self = this.set("getComponent", js.Any.fromFunction0(value))
    @scala.inline
    def setQueries(value: LibraryManagedAttributes[TEntryPointComponent, queries]): Self = this.set("queries", value.asInstanceOf[js.Any])
  }
  
}

