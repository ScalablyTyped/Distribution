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
  
  /* 11 */ val URL: URL with scala.Double = js.native
  /* 29 */ val allDayEvent: allDayEvent with scala.Double = js.native
  /* 19 */ val attachments: attachments with scala.Double = js.native
  /* 8 */ val boolean: boolean with scala.Double = js.native
  /* 17 */ val calculated: calculated with scala.Double = js.native
  /* 6 */ val choice: choice with scala.Double = js.native
  /* 12 */ val computed: computed with scala.Double = js.native
  /* 25 */ val contentTypeId: contentTypeId with scala.Double = js.native
  /* 5 */ val counter: counter with scala.Double = js.native
  /* 22 */ val crossProjectLink: crossProjectLink with scala.Double = js.native
  /* 10 */ val currency: currency with scala.Double = js.native
  /* 4 */ val dateTime: dateTime with scala.Double = js.native
  /* 24 */ val error: error with scala.Double = js.native
  /* 18 */ val file: file with scala.Double = js.native
  /* 31 */ val geolocation: geolocation with scala.Double = js.native
  /* 16 */ val gridChoice: gridChoice with scala.Double = js.native
  /* 14 */ val guid: guid with scala.Double = js.native
  /* 1 */ val integer: integer with scala.Double = js.native
  /* 0 */ val invalid: invalid with scala.Double = js.native
  /* 7 */ val lookup: lookup with scala.Double = js.native
  /* 33 */ val maxItems: maxItems with scala.Double = js.native
  /* 23 */ val modStat: modStat with scala.Double = js.native
  /* 15 */ val multiChoice: multiChoice with scala.Double = js.native
  /* 3 */ val note: note with scala.Double = js.native
  /* 9 */ val number: number with scala.Double = js.native
  /* 32 */ val outcomeChoice: outcomeChoice with scala.Double = js.native
  /* 26 */ val pageSeparator: pageSeparator with scala.Double = js.native
  /* 21 */ val recurrence: recurrence with scala.Double = js.native
  /* 2 */ val text: text with scala.Double = js.native
  /* 27 */ val threadIndex: threadIndex with scala.Double = js.native
  /* 13 */ val threading: threading with scala.Double = js.native
  /* 20 */ val user: user with scala.Double = js.native
  /* 30 */ val workflowEventType: workflowEventType with scala.Double = js.native
  /* 28 */ val workflowStatus: workflowStatus with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.FieldType with scala.Double] = js.native
}

