package typings.scriptableIos

import typings.scriptableIos.scriptableIosStrings.busy
import typings.scriptableIos.scriptableIosStrings.free
import typings.scriptableIos.scriptableIosStrings.tentative
import typings.scriptableIos.scriptableIosStrings.unavailable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Holds reminders and events._
  * @see https://docs.scriptable.app/calendar
  */
trait Calendar extends StObject {
  
  /**
    * _Indicates whether items can be added, edited, and deleted in the calendar._
    * @see https://docs.scriptable.app/calendar/#allowscontentmodifications
    */
  var allowsContentModifications: Boolean
  
  /**
    * _Color of calendar._
    * @see https://docs.scriptable.app/calendar/#color
    */
  var color: Color
  
  /**
    * _Calendar identifier._
    * @see https://docs.scriptable.app/calendar/#identifier
    */
  var identifier: String
  
  /**
    * _Whether the calendar is a subscribed calendar._
    * @see https://docs.scriptable.app/calendar/#issubscribed
    */
  var isSubscribed: Boolean
  
  /**
    * _Removes calendar._
    *
    * The calendar is removed immediately. This cannot be undone.
    * @see https://docs.scriptable.app/calendar/#-remove
    */
  def remove(): Unit
  
  /**
    * _Saves calendar._
    *
    * Saves changes to the calendar.
    * @see https://docs.scriptable.app/calendar/#-save
    */
  def save(): Unit
  
  /**
    * _Checks if the calendar supports availability._
    *
    * The following values are supported:
    *
    * *   busy
    * *   free
    * *   tentative
    * *   unavailable
    *
    * Not all calendars support all of these availabilities and some calendars may not support availability at all. Use this function to check if the calendar supports a specific
    * availability.
    * @param availability - Availability to check against.
    * @see https://docs.scriptable.app/calendar/#-supportsavailability
    */
  def supportsAvailability(availability: busy | free | tentative | unavailable): Boolean
  
  /**
    * _Title of calendar._
    * @see https://docs.scriptable.app/calendar/#title
    */
  var title: String
}
object Calendar {
  
  inline def apply(
    allowsContentModifications: Boolean,
    color: Color,
    identifier: String,
    isSubscribed: Boolean,
    remove: () => Unit,
    save: () => Unit,
    supportsAvailability: busy | free | tentative | unavailable => Boolean,
    title: String
  ): Calendar = {
    val __obj = js.Dynamic.literal(allowsContentModifications = allowsContentModifications.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], isSubscribed = isSubscribed.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), save = js.Any.fromFunction0(save), supportsAvailability = js.Any.fromFunction1(supportsAvailability), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Calendar] (val x: Self) extends AnyVal {
    
    inline def setAllowsContentModifications(value: Boolean): Self = StObject.set(x, "allowsContentModifications", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIsSubscribed(value: Boolean): Self = StObject.set(x, "isSubscribed", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
    
    inline def setSupportsAvailability(value: busy | free | tentative | unavailable => Boolean): Self = StObject.set(x, "supportsAvailability", js.Any.fromFunction1(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
