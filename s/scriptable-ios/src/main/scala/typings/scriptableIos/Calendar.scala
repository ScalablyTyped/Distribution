package typings.scriptableIos

import typings.scriptableIos.scriptableIosStrings.busy
import typings.scriptableIos.scriptableIosStrings.free
import typings.scriptableIos.scriptableIosStrings.tentative
import typings.scriptableIos.scriptableIosStrings.unavailable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Holds reminders and events._
  * @see https://docs.scriptable.app/calendar
  */
@js.native
trait Calendar extends StObject {
  
  /**
    * _Indicates whether items can be added, edited, and deleted in the calendar._
    * @see https://docs.scriptable.app/calendar/#allowscontentmodifications
    */
  var allowsContentModifications: Boolean = js.native
  
  /**
    * _Color of calendar._
    * @see https://docs.scriptable.app/calendar/#color
    */
  var color: Color = js.native
  
  /**
    * _Calendar identifier._
    * @see https://docs.scriptable.app/calendar/#identifier
    */
  var identifier: String = js.native
  
  /**
    * _Whether the calendar is a subscribed calendar._
    * @see https://docs.scriptable.app/calendar/#issubscribed
    */
  var isSubscribed: Boolean = js.native
  
  /**
    * _Removes calendar._
    *
    * The calendar is removed immediately. This cannot be undone.
    * @see https://docs.scriptable.app/calendar/#-remove
    */
  def remove(): Unit = js.native
  
  /**
    * _Saves calendar._
    *
    * Saves changes to the calendar.
    * @see https://docs.scriptable.app/calendar/#-save
    */
  def save(): Unit = js.native
  
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
  @JSName("supportsAvailability")
  def supportsAvailability_busy(availability: busy): Boolean = js.native
  @JSName("supportsAvailability")
  def supportsAvailability_free(availability: free): Boolean = js.native
  @JSName("supportsAvailability")
  def supportsAvailability_tentative(availability: tentative): Boolean = js.native
  @JSName("supportsAvailability")
  def supportsAvailability_unavailable(availability: unavailable): Boolean = js.native
  
  /**
    * _Title of calendar._
    * @see https://docs.scriptable.app/calendar/#title
    */
  var title: String = js.native
}
