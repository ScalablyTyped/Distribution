package typings.reactAddToCalendar

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-add-to-calendar", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[AddToCalendarProps, ComponentState, js.Any] {
    def this(props: AddToCalendarProps) = this()
    def this(props: AddToCalendarProps, context: js.Any) = this()
  }
  @JSImport("react-add-to-calendar", JSImport.Default)
  @js.native
  val default: ComponentClass[AddToCalendarProps, ComponentState] = js.native
  
  @js.native
  trait AddToCalendarEvent extends StObject {
    
    var description: js.UndefOr[String] = js.native
    
    var endTime: js.UndefOr[String | Date] = js.native
    
    var location: js.UndefOr[String] = js.native
    
    var startTime: js.UndefOr[String | Date] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object AddToCalendarEvent {
    
    @scala.inline
    def apply(): AddToCalendarEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddToCalendarEvent]
    }
    
    @scala.inline
    implicit class AddToCalendarEventMutableBuilder[Self <: AddToCalendarEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEndTime(value: String | Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setStartTime(value: String | Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait AddToCalendarProps extends StObject {
    
    var buttonClassClosed: js.UndefOr[String] = js.native
    
    var buttonClassOpen: js.UndefOr[String] = js.native
    
    var buttonIconClass: js.UndefOr[String] = js.native
    
    var buttonLabel: js.UndefOr[String] = js.native
    
    var buttonTemplate: js.UndefOr[js.Any] = js.native
    
    var buttonWrapperClass: js.UndefOr[String] = js.native
    
    var displayItemIcons: js.UndefOr[Boolean] = js.native
    
    var dropdownClass: js.UndefOr[String] = js.native
    
    var event: AddToCalendarEvent = js.native
    
    var listItems: js.UndefOr[js.Array[_]] = js.native
    
    var optionsOpen: js.UndefOr[Boolean] = js.native
    
    var rootClass: js.UndefOr[String] = js.native
    
    var useFontAwesomeIcons: js.UndefOr[Boolean] = js.native
  }
  object AddToCalendarProps {
    
    @scala.inline
    def apply(event: AddToCalendarEvent): AddToCalendarProps = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddToCalendarProps]
    }
    
    @scala.inline
    implicit class AddToCalendarPropsMutableBuilder[Self <: AddToCalendarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonClassClosed(value: String): Self = StObject.set(x, "buttonClassClosed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonClassClosedUndefined: Self = StObject.set(x, "buttonClassClosed", js.undefined)
      
      @scala.inline
      def setButtonClassOpen(value: String): Self = StObject.set(x, "buttonClassOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonClassOpenUndefined: Self = StObject.set(x, "buttonClassOpen", js.undefined)
      
      @scala.inline
      def setButtonIconClass(value: String): Self = StObject.set(x, "buttonIconClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonIconClassUndefined: Self = StObject.set(x, "buttonIconClass", js.undefined)
      
      @scala.inline
      def setButtonLabel(value: String): Self = StObject.set(x, "buttonLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonLabelUndefined: Self = StObject.set(x, "buttonLabel", js.undefined)
      
      @scala.inline
      def setButtonTemplate(value: js.Any): Self = StObject.set(x, "buttonTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTemplateUndefined: Self = StObject.set(x, "buttonTemplate", js.undefined)
      
      @scala.inline
      def setButtonWrapperClass(value: String): Self = StObject.set(x, "buttonWrapperClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonWrapperClassUndefined: Self = StObject.set(x, "buttonWrapperClass", js.undefined)
      
      @scala.inline
      def setDisplayItemIcons(value: Boolean): Self = StObject.set(x, "displayItemIcons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayItemIconsUndefined: Self = StObject.set(x, "displayItemIcons", js.undefined)
      
      @scala.inline
      def setDropdownClass(value: String): Self = StObject.set(x, "dropdownClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownClassUndefined: Self = StObject.set(x, "dropdownClass", js.undefined)
      
      @scala.inline
      def setEvent(value: AddToCalendarEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItems(value: js.Array[_]): Self = StObject.set(x, "listItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItemsUndefined: Self = StObject.set(x, "listItems", js.undefined)
      
      @scala.inline
      def setListItemsVarargs(value: js.Any*): Self = StObject.set(x, "listItems", js.Array(value :_*))
      
      @scala.inline
      def setOptionsOpen(value: Boolean): Self = StObject.set(x, "optionsOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsOpenUndefined: Self = StObject.set(x, "optionsOpen", js.undefined)
      
      @scala.inline
      def setRootClass(value: String): Self = StObject.set(x, "rootClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassUndefined: Self = StObject.set(x, "rootClass", js.undefined)
      
      @scala.inline
      def setUseFontAwesomeIcons(value: Boolean): Self = StObject.set(x, "useFontAwesomeIcons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFontAwesomeIconsUndefined: Self = StObject.set(x, "useFontAwesomeIcons", js.undefined)
    }
  }
  
  type _To = ComponentClass[AddToCalendarProps, ComponentState]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ComponentClass[AddToCalendarProps, ComponentState] = default
}
