package typings.reactPlacesAutocomplete

import typings.googlemaps.google.maps.GeocoderComponentRestrictions
import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.LatLngBoundsLiteral
import typings.googlemaps.google.maps.LatLngLiteral
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.reactPlacesAutocomplete.mod.Suggestion
import typings.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.combobox
import typings.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.list
import typings.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.off
import typings.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.option
import typings.reactPlacesAutocomplete.reactPlacesAutocompleteStrings.text
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ariaactivedescendant extends StObject {
    
    var `aria-activedescendant`: js.UndefOr[String] = js.undefined
    
    var `aria-autocomplete`: list
    
    var `aria-expanded`: Boolean
    
    var autoComplete: off
    
    var disabled: Boolean
    
    var onBlur: FocusEventHandler[Element]
    
    def onChange(ev: Target): Unit
    
    var onKeyDown: KeyboardEventHandler[Element]
    
    var role: combobox
    
    var `type`: text
    
    var value: js.UndefOr[String] = js.undefined
  }
  object Ariaactivedescendant {
    
    @scala.inline
    def apply(
      `aria-expanded`: Boolean,
      disabled: Boolean,
      onBlur: FocusEvent[Element] => Unit,
      onChange: Target => Unit,
      onKeyDown: KeyboardEvent[Element] => Unit
    ): Ariaactivedescendant = {
      val __obj = js.Dynamic.literal(autoComplete = "off", disabled = disabled.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onKeyDown = js.Any.fromFunction1(onKeyDown), role = "combobox")
      __obj.updateDynamic("aria-autocomplete")("list")
      __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("text")
      __obj.asInstanceOf[Ariaactivedescendant]
    }
    
    @scala.inline
    implicit class AriaactivedescendantMutableBuilder[Self <: Ariaactivedescendant] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: list): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoComplete(value: off): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlur(value: FocusEvent[Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChange(value: Target => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[Element] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRole(value: combobox): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Bounds extends StObject {
    
    var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
    
    var componentRestrictions: js.UndefOr[GeocoderComponentRestrictions] = js.undefined
    
    var location: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
    
    var offset: js.UndefOr[Double | String] = js.undefined
    
    var radius: js.UndefOr[Double | String] = js.undefined
    
    var sessionToken: js.UndefOr[js.Any] = js.undefined
    
    var types: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Bounds {
    
    @scala.inline
    def apply(): Bounds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bounds]
    }
    
    @scala.inline
    implicit class BoundsMutableBuilder[Self <: Bounds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setComponentRestrictions(value: GeocoderComponentRestrictions): Self = StObject.set(x, "componentRestrictions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRestrictionsUndefined: Self = StObject.set(x, "componentRestrictions", js.undefined)
      
      @scala.inline
      def setLocation(value: LatLng | LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setRadius(value: Double | String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setSessionToken(value: js.Any): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
      
      @scala.inline
      def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      @scala.inline
      def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
    }
  }
  
  trait Id extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var key: Double
    
    var onClick: MouseEventHandler[Element]
    
    var onMouseDown: MouseEventHandler[Element]
    
    var onMouseEnter: MouseEventHandler[Element]
    
    var onMouseLeave: MouseEventHandler[Element]
    
    var onMouseUp: MouseEventHandler[Element]
    
    var onTouchEnd: TouchEventHandler[Element]
    
    var onTouchStart: TouchEventHandler[Element]
    
    var role: option
  }
  object Id {
    
    @scala.inline
    def apply(
      key: Double,
      onClick: MouseEvent[Element, NativeMouseEvent] => Unit,
      onMouseDown: MouseEvent[Element, NativeMouseEvent] => Unit,
      onMouseEnter: MouseEvent[Element, NativeMouseEvent] => Unit,
      onMouseLeave: MouseEvent[Element, NativeMouseEvent] => Unit,
      onMouseUp: MouseEvent[Element, NativeMouseEvent] => Unit,
      onTouchEnd: TouchEvent[Element] => Unit,
      onTouchStart: TouchEvent[Element] => Unit
    ): Id = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseEnter = js.Any.fromFunction1(onMouseEnter), onMouseLeave = js.Any.fromFunction1(onMouseLeave), onMouseUp = js.Any.fromFunction1(onMouseUp), onTouchEnd = js.Any.fromFunction1(onTouchEnd), onTouchStart = js.Any.fromFunction1(onTouchStart), role = "option")
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDown(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnter(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeave(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUp(value: MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEnd(value: TouchEvent[Element] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStart(value: TouchEvent[Element] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRole(value: option): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  trait MainText extends StObject {
    
    var mainText: String
    
    var secondaryText: String
  }
  object MainText {
    
    @scala.inline
    def apply(mainText: String, secondaryText: String): MainText = {
      val __obj = js.Dynamic.literal(mainText = mainText.asInstanceOf[js.Any], secondaryText = secondaryText.asInstanceOf[js.Any])
      __obj.asInstanceOf[MainText]
    }
    
    @scala.inline
    implicit class MainTextMutableBuilder[Self <: MainText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMainText(value: String): Self = StObject.set(x, "mainText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryText(value: String): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{  loading :boolean,   suggestions :std.ReadonlyArray<react-places-autocomplete.react-places-autocomplete.Suggestion>, getInputProps <InputProps extends {}>(options : InputProps | undefined): {  type :'text',   autoComplete :'off',   role :'combobox',   aria-autocomplete :'list',   aria-expanded :boolean,   aria-activedescendant :string | undefined,   disabled :boolean,   onKeyDown :react.react.KeyboardEventHandler<std.Element>,   onBlur :react.react.FocusEventHandler<std.Element>,   value :string | undefined, onChange (ev : {  target :{  value :string}}): void} & InputProps, getSuggestionItemProps <SuggestionProps extends {}>(suggestion : react-places-autocomplete.react-places-autocomplete.Suggestion, options : SuggestionProps | undefined): {  key :number,   id :string | undefined,   role :'option',   onMouseEnter :react.react.MouseEventHandler<std.Element>,   onMouseLeave :react.react.MouseEventHandler<std.Element>,   onMouseDown :react.react.MouseEventHandler<std.Element>,   onMouseUp :react.react.MouseEventHandler<std.Element>,   onTouchStart :react.react.TouchEventHandler<std.Element>,   onTouchEnd :react.react.TouchEventHandler<std.Element>,   onClick :react.react.MouseEventHandler<std.Element>} & SuggestionProps}> */
  trait Readonlyloadingbooleansug extends StObject {
    
    val getInputProps: js.Function1[/* options */ js.UndefOr[js.Object], Ariaactivedescendant & js.Object]
    
    val getSuggestionItemProps: js.Function2[/* suggestion */ Suggestion, /* options */ js.UndefOr[js.Object], Id & js.Object]
    
    val loading: Boolean
    
    val suggestions: js.Array[Suggestion]
  }
  object Readonlyloadingbooleansug {
    
    @scala.inline
    def apply(
      getInputProps: /* options */ js.UndefOr[js.Object] => Ariaactivedescendant & js.Object,
      getSuggestionItemProps: (/* suggestion */ Suggestion, /* options */ js.UndefOr[js.Object]) => Id & js.Object,
      loading: Boolean,
      suggestions: js.Array[Suggestion]
    ): Readonlyloadingbooleansug = {
      val __obj = js.Dynamic.literal(getInputProps = js.Any.fromFunction1(getInputProps), getSuggestionItemProps = js.Any.fromFunction2(getSuggestionItemProps), loading = loading.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Readonlyloadingbooleansug]
    }
    
    @scala.inline
    implicit class ReadonlyloadingbooleansugMutableBuilder[Self <: Readonlyloadingbooleansug] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetInputProps(value: /* options */ js.UndefOr[js.Object] => Ariaactivedescendant & js.Object): Self = StObject.set(x, "getInputProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSuggestionItemProps(value: (/* suggestion */ Suggestion, /* options */ js.UndefOr[js.Object]) => Id & js.Object): Self = StObject.set(x, "getSuggestionItemProps", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestions(value: js.Array[Suggestion]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionsVarargs(value: Suggestion*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
    }
  }
  
  trait Target extends StObject {
    
    var target: Value
  }
  object Target {
    
    @scala.inline
    def apply(target: Value): Target = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    @scala.inline
    implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: Value): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var value: String
  }
  object Value {
    
    @scala.inline
    def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
