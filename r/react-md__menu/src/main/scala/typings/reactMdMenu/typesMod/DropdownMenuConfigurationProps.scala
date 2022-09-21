package typings.reactMdMenu.typesMod

import typings.reactMdMenu.anon.ReadonlyCalculateFixedPos
import typings.reactMdUtils.positioningTypesMod.PositionAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownMenuConfigurationProps extends StObject {
  
  /**
    * The {@link PositionAnchor} to use for the menu. Here's the default value
    * for the anchor:
    *
    * - horizontal - `BELOW_CENTER_ANCHOR`
    * - a submenu - `TOP_RIGHT_ANCHOR`
    * - default - `TOP_INNER_RIGHT_ANCHOR`
    */
  var anchor: js.UndefOr[PositionAnchor] = js.undefined
  
  /**
    * Boolean if the menu should close instead of repositioning itself if the
    * browser window is resized.
    *
    * @defaultValue `false`
    */
  var closeOnResize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Boolean if the menu should close if the page is scrolled. The default
    * behavior is to just update the position of the menu relative to the menu
    * button until it can no longer be visible within the viewport.
    *
    * @defaultValue `false`
    */
  var closeOnScroll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Boolean if the menu component should not gain focus once it has mounted.
    * This should really only be set to `true` if the enter transition has been
    * disabled.
    *
    * @defaultValue `timeout === 0`
    */
  var disableFocusOnMount: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Boolean if the toggle element should no longer gain focus when the menu
    * loses visibility.
    *
    * Note: The toggle element will not gain focus if:
    * - the menu closed via resizing the browser window
    * - the menu closes because the menu is no longer within the viewport
    * - the current `document.activeElement` has moved outside of the menu
    *   - this generally means the `MenuItem`'s action cause the focus to move
    *     already
    * - the current `document.activeElement` is an link (`<a href="">`)
    *   - links should generally handle focus behavior themselves
    *
    * @defaultValue `timeout === 0`
    */
  var disableFocusOnUnmount: js.UndefOr[Boolean] = js.undefined
  
  /** {@inheritDoc CalculateFixedPositionOptions} */
  var fixedPositionOptions: js.UndefOr[ReadonlyCalculateFixedPos] = js.undefined
  
  /**
    * A function that can be used to get the
    * {@link CalculateFixedPositionOptions} dynamically.
    */
  var getFixedPositionOptions: js.UndefOr[js.Function0[ReadonlyCalculateFixedPos]] = js.undefined
  
  /**
    * An optional `aria-label` that should be applied to the `Menu` component. If
    * this is `undefined`, an `aria-labelledby` will be provided to the `Menu`
    * instead linking to the {@link id} of the `Button`.
    */
  var menuLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Boolean if the page should no longer be scrollable while the menu is
    * visible.
    *
    * @defaultValue `false`
    */
  var preventScroll: js.UndefOr[Boolean] = js.undefined
}
object DropdownMenuConfigurationProps {
  
  inline def apply(): DropdownMenuConfigurationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownMenuConfigurationProps]
  }
  
  extension [Self <: DropdownMenuConfigurationProps](x: Self) {
    
    inline def setAnchor(value: PositionAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setCloseOnResize(value: Boolean): Self = StObject.set(x, "closeOnResize", value.asInstanceOf[js.Any])
    
    inline def setCloseOnResizeUndefined: Self = StObject.set(x, "closeOnResize", js.undefined)
    
    inline def setCloseOnScroll(value: Boolean): Self = StObject.set(x, "closeOnScroll", value.asInstanceOf[js.Any])
    
    inline def setCloseOnScrollUndefined: Self = StObject.set(x, "closeOnScroll", js.undefined)
    
    inline def setDisableFocusOnMount(value: Boolean): Self = StObject.set(x, "disableFocusOnMount", value.asInstanceOf[js.Any])
    
    inline def setDisableFocusOnMountUndefined: Self = StObject.set(x, "disableFocusOnMount", js.undefined)
    
    inline def setDisableFocusOnUnmount(value: Boolean): Self = StObject.set(x, "disableFocusOnUnmount", value.asInstanceOf[js.Any])
    
    inline def setDisableFocusOnUnmountUndefined: Self = StObject.set(x, "disableFocusOnUnmount", js.undefined)
    
    inline def setFixedPositionOptions(value: ReadonlyCalculateFixedPos): Self = StObject.set(x, "fixedPositionOptions", value.asInstanceOf[js.Any])
    
    inline def setFixedPositionOptionsUndefined: Self = StObject.set(x, "fixedPositionOptions", js.undefined)
    
    inline def setGetFixedPositionOptions(value: () => ReadonlyCalculateFixedPos): Self = StObject.set(x, "getFixedPositionOptions", js.Any.fromFunction0(value))
    
    inline def setGetFixedPositionOptionsUndefined: Self = StObject.set(x, "getFixedPositionOptions", js.undefined)
    
    inline def setMenuLabel(value: String): Self = StObject.set(x, "menuLabel", value.asInstanceOf[js.Any])
    
    inline def setMenuLabelUndefined: Self = StObject.set(x, "menuLabel", js.undefined)
    
    inline def setPreventScroll(value: Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
    
    inline def setPreventScrollUndefined: Self = StObject.set(x, "preventScroll", js.undefined)
  }
}
