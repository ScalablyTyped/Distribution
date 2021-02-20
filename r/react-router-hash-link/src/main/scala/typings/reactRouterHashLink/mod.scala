package typings.reactRouterHashLink

import typings.history.mod.Location
import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import typings.react.mod.Component
import typings.reactRouterDom.mod.LinkProps
import typings.reactRouterDom.mod.NavLinkProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-router-hash-link", "HashLink")
  @js.native
  class HashLink protected ()
    extends Component[HashLinkProps, js.Any, js.Any] {
    def this(props: HashLinkProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HashLinkProps, context: js.Any) = this()
  }
  
  @JSImport("react-router-hash-link", "NavHashLink")
  @js.native
  class NavHashLink protected ()
    extends Component[NavHashLinkProps, js.Any, js.Any] {
    def this(props: NavHashLinkProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NavHashLinkProps, context: js.Any) = this()
  }
  
  @js.native
  trait HashLinkProps extends LinkProps[LocationState] {
    
    var scroll: js.UndefOr[js.Function1[/* element */ HTMLElement, Unit]] = js.native
    
    var smooth: js.UndefOr[Boolean] = js.native
  }
  object HashLinkProps {
    
    @scala.inline
    def apply(
      to: LocationDescriptor[LocationState] | (js.Function1[/* location */ Location[LocationState], LocationDescriptor[LocationState]])
    ): HashLinkProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashLinkProps]
    }
    
    @scala.inline
    implicit class HashLinkPropsMutableBuilder[Self <: HashLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScroll(value: /* element */ HTMLElement => Unit): Self = StObject.set(x, "scroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      @scala.inline
      def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.react.mod.DOMAttributes because Already inherited
  - typings.react.mod.AriaAttributes because Already inherited
  - typings.react.mod.HTMLAttributes because Already inherited
  - typings.react.mod.AnchorHTMLAttributes because Already inherited
  - typings.reactRouterDom.mod.LinkProps because Already inherited
  - typings.reactRouterHashLink.mod.HashLinkProps because var conflicts: about, accessKey, `aria-activedescendant`, `aria-atomic`, `aria-autocomplete`, `aria-busy`, `aria-checked`, `aria-colcount`, `aria-colindex`, `aria-colspan`, `aria-controls`, `aria-current`, `aria-describedby`, `aria-details`, `aria-disabled`, `aria-dropeffect`, `aria-errormessage`, `aria-expanded`, `aria-flowto`, `aria-grabbed`, `aria-haspopup`, `aria-hidden`, `aria-invalid`, `aria-keyshortcuts`, `aria-label`, `aria-labelledby`, `aria-level`, `aria-live`, `aria-modal`, `aria-multiline`, `aria-multiselectable`, `aria-orientation`, `aria-owns`, `aria-placeholder`, `aria-posinset`, `aria-pressed`, `aria-readonly`, `aria-relevant`, `aria-required`, `aria-roledescription`, `aria-rowcount`, `aria-rowindex`, `aria-rowspan`, `aria-selected`, `aria-setsize`, `aria-sort`, `aria-valuemax`, `aria-valuemin`, `aria-valuenow`, `aria-valuetext`, autoCapitalize, autoCorrect, autoSave, children, className, color, component, contentEditable, contextMenu, dangerouslySetInnerHTML, datatype, defaultChecked, defaultValue, dir, download, draggable, hidden, href, hrefLang, id, inlist, innerRef, inputMode, is, itemID, itemProp, itemRef, itemScope, itemType, lang, media, onAbort, onAnimationEnd, onAnimationIteration, onAnimationStart, onAuxClick, onBeforeInput, onBlur, onCanPlay, onCanPlayThrough, onChange, onClick, onCompositionEnd, onCompositionStart, onCompositionUpdate, onContextMenu, onCopy, onCut, onDoubleClick, onDrag, onDragEnd, onDragEnter, onDragExit, onDragLeave, onDragOver, onDragStart, onDrop, onDurationChange, onEmptied, onEncrypted, onEnded, onError, onFocus, onInput, onInvalid, onKeyDown, onKeyPress, onKeyUp, onLoad, onLoadStart, onLoadedData, onLoadedMetadata, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onPaste, onPause, onPlay, onPlaying, onPointerCancel, onPointerDown, onPointerEnter, onPointerLeave, onPointerMove, onPointerOut, onPointerOver, onPointerUp, onProgress, onRateChange, onReset, onScroll, onSeeked, onSeeking, onSelect, onStalled, onSubmit, onSuspend, onTimeUpdate, onTouchCancel, onTouchEnd, onTouchMove, onTouchStart, onTransitionEnd, onVolumeChange, onWaiting, onWheel, ping, placeholder, prefix, property, radioGroup, referrerPolicy, rel, replace, resource, results, role, security, slot, spellCheck, style, suppressContentEditableWarning, suppressHydrationWarning, tabIndex, target, title, to, translate, `type`, typeof, unselectable, vocab. Inlined smooth, scroll */ @js.native
  trait NavHashLinkProps extends NavLinkProps[LocationState] {
    
    var scroll: js.UndefOr[js.Function1[/* element */ HTMLElement, Unit]] = js.native
    
    var smooth: js.UndefOr[Boolean] = js.native
  }
  object NavHashLinkProps {
    
    @scala.inline
    def apply(
      to: LocationDescriptor[LocationState] | (js.Function1[/* location */ Location[LocationState], LocationDescriptor[LocationState]])
    ): NavHashLinkProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavHashLinkProps]
    }
    
    @scala.inline
    implicit class NavHashLinkPropsMutableBuilder[Self <: NavHashLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScroll(value: /* element */ HTMLElement => Unit): Self = StObject.set(x, "scroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      @scala.inline
      def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
    }
  }
}
