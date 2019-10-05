package typings.semanticDashUiDashDimmer.SemanticUI.Dimmer.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'active'
    */
  var active: String
  /**
    * @default 'dimmable'
    */
  var dimmable: String
  /**
    * @default 'dimmed'
    */
  var dimmed: String
  /**
    * @default 'disabled'
    */
  var disabled: String
  /**
    * @default 'hide'
    */
  var hide: String
  /**
    * @default 'page'
    */
  var pageDimmer: String
  /**
    * @default 'show'
    */
  var show: String
  /**
    * @default 'transition'
    */
  var transition: String
}

object _Impl {
  @scala.inline
  def apply(
    active: String,
    dimmable: String,
    dimmed: String,
    disabled: String,
    hide: String,
    pageDimmer: String,
    show: String,
    transition: String
  ): _Impl = {
    val __obj = js.Dynamic.literal(active = active, dimmable = dimmable, dimmed = dimmed, disabled = disabled, hide = hide, pageDimmer = pageDimmer, show = show, transition = transition)
  
    __obj.asInstanceOf[_Impl]
  }
}

