package typings.semanticUiDimmer.SemanticUI.Dimmer.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
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

object Impl {
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
  ): Impl = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], dimmable = dimmable.asInstanceOf[js.Any], dimmed = dimmed.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], pageDimmer = pageDimmer.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

