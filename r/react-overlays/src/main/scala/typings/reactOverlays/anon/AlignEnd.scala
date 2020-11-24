package typings.reactOverlays.anon

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignEnd extends js.Object {
  
  /**
    * Aligns the dropdown menu to the 'end' of it's placement position.
    * Generally this is provided by the parent `Dropdown` component,
    * but may also be specified as a prop directly.
    */
  var alignEnd: Requireable[Boolean] = js.native
  
  /**
    * A render prop that returns a Menu element. The `props`
    * argument should spread through to **a component that can accept a ref**.
    *
    * @type {Function ({
    *   show: boolean,
    *   alignEnd: boolean,
    *   close: (?SyntheticEvent) => void,
    *   placement: Placement,
    *   update: () => void,
    *   forceUpdate: () => void,
    *   props: {
    *     ref: (?HTMLElement) => void,
    *     style: { [string]: string | number },
    *     aria-labelledby: ?string
    *   },
    *   arrowProps: {
    *     ref: (?HTMLElement) => void,
    *     style: { [string]: string | number },
    *   },
    * }) => React.Element}
    */
  var children: Validator[js.Function1[/* repeated */ _, _]] = js.native
  
  /**
    * Enables the Popper.js `flip` modifier, allowing the Dropdown to
    * automatically adjust it's placement in case of overlap with the viewport or toggle.
    * Refer to the [flip docs](https://popper.js.org/popper-documentation.html#modifiers..flip.enabled) for more info
    */
  var flip: Requireable[Boolean] = js.native
  
  /**
    * A set of popper options and props passed directly to react-popper's Popper component.
    */
  var popperConfig: Requireable[js.Object] = js.native
  
  /**
    * Override the default event used by RootCloseWrapper.
    */
  var rootCloseEvent: Requireable[String] = js.native
  
  /**
    * Controls the visible state of the menu, generally this is
    * provided by the parent `Dropdown` component,
    * but may also be specified as a prop directly.
    */
  var show: Requireable[Boolean] = js.native
  
  var usePopper: Requireable[Boolean] = js.native
}
object AlignEnd {
  
  @scala.inline
  def apply(
    alignEnd: Requireable[Boolean],
    children: Validator[js.Function1[/* repeated */ _, _]],
    flip: Requireable[Boolean],
    popperConfig: Requireable[js.Object],
    rootCloseEvent: Requireable[String],
    show: Requireable[Boolean],
    usePopper: Requireable[Boolean]
  ): AlignEnd = {
    val __obj = js.Dynamic.literal(alignEnd = alignEnd.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], flip = flip.asInstanceOf[js.Any], popperConfig = popperConfig.asInstanceOf[js.Any], rootCloseEvent = rootCloseEvent.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], usePopper = usePopper.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignEnd]
  }
  
  @scala.inline
  implicit class AlignEndOps[Self <: AlignEnd] (val x: Self) extends AnyVal {
    
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
    def setAlignEnd(value: Requireable[Boolean]): Self = this.set("alignEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: Validator[js.Function1[/* repeated */ _, _]]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlip(value: Requireable[Boolean]): Self = this.set("flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopperConfig(value: Requireable[js.Object]): Self = this.set("popperConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootCloseEvent(value: Requireable[String]): Self = this.set("rootCloseEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: Requireable[Boolean]): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsePopper(value: Requireable[Boolean]): Self = this.set("usePopper", value.asInstanceOf[js.Any])
  }
}
