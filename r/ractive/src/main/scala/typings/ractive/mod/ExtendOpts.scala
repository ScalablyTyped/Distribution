package typings.ractive.mod

import typings.ractive.anon.Optional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendOpts[T /* <: Ractive[T] */] extends BaseInitOpts[T] {
  /** A list of attributes to be reserved by a component. Any additional attributes are collected into the extra-attributes partial. */
  var attributes: js.UndefOr[js.Array[String] | Optional] = js.native
  /** The css to add to the page when the first instance of this component is rendered. */
  var css: js.UndefOr[String | CssFn] = js.native
  /** Default data to be supplied to any css functions. */
  var cssData: js.UndefOr[ValueMap] = js.native
  /** The id to use when transforming css to be scoped. Defaults to a random guid. */
  var cssId: js.UndefOr[String] = js.native
  /** A function supplying the default data for instances of this component. */
  var data: js.UndefOr[DataFn[T]] = js.native
  /** Whether or not data and plugins can be pulled from parent instances. Defaults to false. */
  var isolated: js.UndefOr[Boolean] = js.native
  /** If true, css selectors will not be scoped using the cssId of this component. */
  var noCssTransform: js.UndefOr[Boolean] = js.native
  /** An array of plugins to apply to the component. */
  var use: js.UndefOr[js.Array[PluginExtend]] = js.native
}

object ExtendOpts {
  @scala.inline
  def apply[/* <: typings.ractive.mod.Ractive[T] */ T](): ExtendOpts[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendOpts[T]]
  }
  @scala.inline
  implicit class ExtendOptsOps[Self <: ExtendOpts[_], /* <: typings.ractive.mod.Ractive[T] */ T] (val x: Self with ExtendOpts[T]) extends AnyVal {
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
    def setAttributesVarargs(value: String*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[String] | Optional): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setCssFunction1(value: /* data */ DataGetFn => String): Self = this.set("css", js.Any.fromFunction1(value))
    @scala.inline
    def setCss(value: String | CssFn): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setCssData(value: ValueMap): Self = this.set("cssData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssData: Self = this.set("cssData", js.undefined)
    @scala.inline
    def setCssId(value: String): Self = this.set("cssId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssId: Self = this.set("cssId", js.undefined)
    @scala.inline
    def setData(value: DataFn[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setIsolated(value: Boolean): Self = this.set("isolated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsolated: Self = this.set("isolated", js.undefined)
    @scala.inline
    def setNoCssTransform(value: Boolean): Self = this.set("noCssTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoCssTransform: Self = this.set("noCssTransform", js.undefined)
    @scala.inline
    def setUseVarargs(value: PluginExtend*): Self = this.set("use", js.Array(value :_*))
    @scala.inline
    def setUse(value: js.Array[PluginExtend]): Self = this.set("use", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUse: Self = this.set("use", js.undefined)
  }
  
}

