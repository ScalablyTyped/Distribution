package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FieldType extends js.Object

@JSGlobal("SP.FieldType")
@js.native
object FieldType extends js.Object {
  @js.native
  sealed trait URL
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait allDayEvent
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait attachments
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait boolean
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait calculated
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait choice
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait computed
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait contentTypeId
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait counter
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait crossProjectLink
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait currency
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait dateTime
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait error
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait file
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait geolocation
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait gridChoice
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait guid
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait integer
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait invalid
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait lookup
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait maxItems
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait modStat
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait multiChoice
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait note
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait number
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait outcomeChoice
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait pageSeparator
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait recurrence
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait text
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait threadIndex
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait threading
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait user
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait workflowEventType
    extends sharepointLib.SPNs.FieldType
  
  @js.native
  sealed trait workflowStatus
    extends sharepointLib.SPNs.FieldType
  
  val URL: URL with java.lang.String = js.native
  val allDayEvent: allDayEvent with java.lang.String = js.native
  val attachments: attachments with java.lang.String = js.native
  val boolean: boolean with java.lang.String = js.native
  val calculated: calculated with java.lang.String = js.native
  val choice: choice with java.lang.String = js.native
  val computed: computed with java.lang.String = js.native
  val contentTypeId: contentTypeId with java.lang.String = js.native
  val counter: counter with java.lang.String = js.native
  val crossProjectLink: crossProjectLink with java.lang.String = js.native
  val currency: currency with java.lang.String = js.native
  val dateTime: dateTime with java.lang.String = js.native
  val error: error with java.lang.String = js.native
  val file: file with java.lang.String = js.native
  val geolocation: geolocation with java.lang.String = js.native
  val gridChoice: gridChoice with java.lang.String = js.native
  val guid: guid with java.lang.String = js.native
  val integer: integer with java.lang.String = js.native
  val invalid: invalid with java.lang.String = js.native
  val lookup: lookup with java.lang.String = js.native
  val maxItems: maxItems with java.lang.String = js.native
  val modStat: modStat with java.lang.String = js.native
  val multiChoice: multiChoice with java.lang.String = js.native
  val note: note with java.lang.String = js.native
  val number: number with java.lang.String = js.native
  val outcomeChoice: outcomeChoice with java.lang.String = js.native
  val pageSeparator: pageSeparator with java.lang.String = js.native
  val recurrence: recurrence with java.lang.String = js.native
  val text: text with java.lang.String = js.native
  val threadIndex: threadIndex with java.lang.String = js.native
  val threading: threading with java.lang.String = js.native
  val user: user with java.lang.String = js.native
  val workflowEventType: workflowEventType with java.lang.String = js.native
  val workflowStatus: workflowStatus with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.FieldType with java.lang.String] = js.native
}

