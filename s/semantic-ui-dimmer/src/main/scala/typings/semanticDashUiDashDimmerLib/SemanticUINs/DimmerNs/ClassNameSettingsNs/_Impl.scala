package typings
package semanticDashUiDashDimmerLib.SemanticUINs.DimmerNs.ClassNameSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'active'
    */
  var active: java.lang.String
  /**
    * @default 'dimmable'
    */
  var dimmable: java.lang.String
  /**
    * @default 'dimmed'
    */
  var dimmed: java.lang.String
  /**
    * @default 'disabled'
    */
  var disabled: java.lang.String
  /**
    * @default 'hide'
    */
  var hide: java.lang.String
  /**
    * @default 'page'
    */
  var pageDimmer: java.lang.String
  /**
    * @default 'show'
    */
  var show: java.lang.String
  /**
    * @default 'transition'
    */
  var transition: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    active: java.lang.String,
    dimmable: java.lang.String,
    dimmed: java.lang.String,
    disabled: java.lang.String,
    hide: java.lang.String,
    pageDimmer: java.lang.String,
    show: java.lang.String,
    transition: java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("dimmable")(dimmable)
    __obj.updateDynamic("dimmed")(dimmed)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("hide")(hide)
    __obj.updateDynamic("pageDimmer")(pageDimmer)
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[_Impl]
  }
}

