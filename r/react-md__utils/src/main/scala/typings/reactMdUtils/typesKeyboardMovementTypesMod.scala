package typings.reactMdUtils

import typings.reactMdUtils.typesTypesMod.NonNullRef
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesKeyboardMovementTypesMod {
  
  /* Inlined parent std.Required<@react-md/utils.@react-md/utils/types/keyboardMovement/types.KeyboardMovementBehavior> */
  trait KeyboardFocusContext extends StObject {
    
    /**
      * A function that is used to add an element to the list of focusable
      * elements.
      */
    def attach[E /* <: HTMLElement */](element: E): Unit
    
    /** {@inheritDoc KeyboardMovementConfig} */
    var config: NonNullRef[KeyboardMovementConfig]
    
    /**
      * A function that is used to remove an element to the list of focusable
      * elements.
      */
    def detach[E /* <: HTMLElement */](element: E): Unit
    
    var horizontal: Boolean
    
    var includeDisabled: Boolean
    
    var loopable: Boolean
    
    var searchable: Boolean
    
    /** {@inheritDoc KeyboardFocusElementLookup} */
    var watching: KeyboardFocusElementLookup
  }
  object KeyboardFocusContext {
    
    inline def apply(
      attach: Any => Unit,
      config: NonNullRef[KeyboardMovementConfig],
      detach: Any => Unit,
      horizontal: Boolean,
      includeDisabled: Boolean,
      loopable: Boolean,
      searchable: Boolean,
      watching: KeyboardFocusElementLookup
    ): KeyboardFocusContext = {
      val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), config = config.asInstanceOf[js.Any], detach = js.Any.fromFunction1(detach), horizontal = horizontal.asInstanceOf[js.Any], includeDisabled = includeDisabled.asInstanceOf[js.Any], loopable = loopable.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], watching = watching.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardFocusContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyboardFocusContext] (val x: Self) extends AnyVal {
      
      inline def setAttach(value: Any => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction1(value))
      
      inline def setConfig(value: NonNullRef[KeyboardMovementConfig]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setDetach(value: Any => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction1(value))
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setIncludeDisabled(value: Boolean): Self = StObject.set(x, "includeDisabled", value.asInstanceOf[js.Any])
      
      inline def setLoopable(value: Boolean): Self = StObject.set(x, "loopable", value.asInstanceOf[js.Any])
      
      inline def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
      
      inline def setWatching(value: KeyboardFocusElementLookup): Self = StObject.set(x, "watching", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyboardFocusElementData extends StObject {
    
    /**
      * The text content of the element that is used for searching. This will be
      * the empty string if the {@link KeyboardMovementBehavior.searchable} is
      * false
      */
    var content: String
    
    /**
      * The element that can be keyboard focused.
      */
    var element: HTMLElement
  }
  object KeyboardFocusElementData {
    
    inline def apply(content: String, element: HTMLElement): KeyboardFocusElementData = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardFocusElementData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyboardFocusElementData] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    }
  }
  
  type KeyboardFocusElementLookup = NonNullRef[js.Array[KeyboardFocusElementData]]
  
  trait KeyboardMovementBehavior extends StObject {
    
    /**
      * Boolean if the keyboard movement is horizontal instead of vertical. This
      * updates the default keyboard config to use `ArrowRight` and `ArrowLeft`
      * instead of `ArrowDown` and `ArrowUp`,
      *
      * @remarks \@since 5.1.2
      * @defaultValue `false`
      */
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if elements that are `aria-disabled` or `disabled` should still be
      * able to gain focus.
      *
      * @defaultValue `false`
      */
    var includeDisabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the {@link KeyboardMovementProvider} should allow the focus behavior
      * to loop from the first to last or last to first item instead of preventing
      * any new focus behavior. In other words... if the last item is focused and
      * the user presses a key that should advance the focus to the next focusable
      * element, should the focus stay on the current element or loop back and
      * focus the first focusable item.
      *
      * @defaultValue `false`
      */
    var loopable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if pressing a letter will focus the next item in the
      * {@link KeyboardMovementProvider} that starts with the same letter.
      *
      * @defaultValue `false`
      */
    var searchable: js.UndefOr[Boolean] = js.undefined
  }
  object KeyboardMovementBehavior {
    
    inline def apply(): KeyboardMovementBehavior = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardMovementBehavior]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyboardMovementBehavior] (val x: Self) extends AnyVal {
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setIncludeDisabled(value: Boolean): Self = StObject.set(x, "includeDisabled", value.asInstanceOf[js.Any])
      
      inline def setIncludeDisabledUndefined: Self = StObject.set(x, "includeDisabled", js.undefined)
      
      inline def setLoopable(value: Boolean): Self = StObject.set(x, "loopable", value.asInstanceOf[js.Any])
      
      inline def setLoopableUndefined: Self = StObject.set(x, "loopable", js.undefined)
      
      inline def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
      
      inline def setSearchableUndefined: Self = StObject.set(x, "searchable", js.undefined)
    }
  }
  
  /* Inlined std.Required<@react-md/utils.@react-md/utils/types/keyboardMovement/types.KeyboardMovementConfiguration> */
  trait KeyboardMovementConfig extends StObject {
    
    var decrementKeys: js.Array[String]
    
    var incrementKeys: js.Array[String]
    
    var jumpToFirstKeys: js.Array[String]
    
    var jumpToLastKeys: js.Array[String]
  }
  object KeyboardMovementConfig {
    
    inline def apply(
      decrementKeys: js.Array[String],
      incrementKeys: js.Array[String],
      jumpToFirstKeys: js.Array[String],
      jumpToLastKeys: js.Array[String]
    ): KeyboardMovementConfig = {
      val __obj = js.Dynamic.literal(decrementKeys = decrementKeys.asInstanceOf[js.Any], incrementKeys = incrementKeys.asInstanceOf[js.Any], jumpToFirstKeys = jumpToFirstKeys.asInstanceOf[js.Any], jumpToLastKeys = jumpToLastKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyboardMovementConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyboardMovementConfig] (val x: Self) extends AnyVal {
      
      inline def setDecrementKeys(value: js.Array[String]): Self = StObject.set(x, "decrementKeys", value.asInstanceOf[js.Any])
      
      inline def setDecrementKeysVarargs(value: String*): Self = StObject.set(x, "decrementKeys", js.Array(value*))
      
      inline def setIncrementKeys(value: js.Array[String]): Self = StObject.set(x, "incrementKeys", value.asInstanceOf[js.Any])
      
      inline def setIncrementKeysVarargs(value: String*): Self = StObject.set(x, "incrementKeys", js.Array(value*))
      
      inline def setJumpToFirstKeys(value: js.Array[String]): Self = StObject.set(x, "jumpToFirstKeys", value.asInstanceOf[js.Any])
      
      inline def setJumpToFirstKeysVarargs(value: String*): Self = StObject.set(x, "jumpToFirstKeys", js.Array(value*))
      
      inline def setJumpToLastKeys(value: js.Array[String]): Self = StObject.set(x, "jumpToLastKeys", value.asInstanceOf[js.Any])
      
      inline def setJumpToLastKeysVarargs(value: String*): Self = StObject.set(x, "jumpToLastKeys", js.Array(value*))
    }
  }
  
  trait KeyboardMovementConfiguration extends StObject {
    
    /**
      * A list of keys that will attempt to decrement the focus index by 1.
      *
      * @defaultValue `["ArrowUp"]`
      */
    var decrementKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A list of keys that will attempt to increment the focus index by 1.
      *
      * @defaultValue `["ArrowDown"]`
      */
    var incrementKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A list of keys that will set the focus index to `0`.
      *
      * @defaultValue `["Home"]`
      */
    var jumpToFirstKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A list of keys that will set the focus index to the last focusable index.
      *
      * @defaultValue `["End"]`
      */
    var jumpToLastKeys: js.UndefOr[js.Array[String]] = js.undefined
  }
  object KeyboardMovementConfiguration {
    
    inline def apply(): KeyboardMovementConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardMovementConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyboardMovementConfiguration] (val x: Self) extends AnyVal {
      
      inline def setDecrementKeys(value: js.Array[String]): Self = StObject.set(x, "decrementKeys", value.asInstanceOf[js.Any])
      
      inline def setDecrementKeysUndefined: Self = StObject.set(x, "decrementKeys", js.undefined)
      
      inline def setDecrementKeysVarargs(value: String*): Self = StObject.set(x, "decrementKeys", js.Array(value*))
      
      inline def setIncrementKeys(value: js.Array[String]): Self = StObject.set(x, "incrementKeys", value.asInstanceOf[js.Any])
      
      inline def setIncrementKeysUndefined: Self = StObject.set(x, "incrementKeys", js.undefined)
      
      inline def setIncrementKeysVarargs(value: String*): Self = StObject.set(x, "incrementKeys", js.Array(value*))
      
      inline def setJumpToFirstKeys(value: js.Array[String]): Self = StObject.set(x, "jumpToFirstKeys", value.asInstanceOf[js.Any])
      
      inline def setJumpToFirstKeysUndefined: Self = StObject.set(x, "jumpToFirstKeys", js.undefined)
      
      inline def setJumpToFirstKeysVarargs(value: String*): Self = StObject.set(x, "jumpToFirstKeys", js.Array(value*))
      
      inline def setJumpToLastKeys(value: js.Array[String]): Self = StObject.set(x, "jumpToLastKeys", value.asInstanceOf[js.Any])
      
      inline def setJumpToLastKeysUndefined: Self = StObject.set(x, "jumpToLastKeys", js.undefined)
      
      inline def setJumpToLastKeysVarargs(value: String*): Self = StObject.set(x, "jumpToLastKeys", js.Array(value*))
    }
  }
}
