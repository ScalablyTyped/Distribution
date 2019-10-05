package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FieldType extends js.Object

@JSGlobal("SP.FieldType")
@js.native
object FieldType extends js.Object {
  @js.native
  sealed trait URL extends FieldType
  
  @js.native
  sealed trait allDayEvent extends FieldType
  
  @js.native
  sealed trait attachments extends FieldType
  
  @js.native
  sealed trait boolean extends FieldType
  
  @js.native
  sealed trait calculated extends FieldType
  
  @js.native
  sealed trait choice extends FieldType
  
  @js.native
  sealed trait computed extends FieldType
  
  @js.native
  sealed trait contentTypeId extends FieldType
  
  @js.native
  sealed trait counter extends FieldType
  
  @js.native
  sealed trait crossProjectLink extends FieldType
  
  @js.native
  sealed trait currency extends FieldType
  
  @js.native
  sealed trait dateTime extends FieldType
  
  @js.native
  sealed trait error extends FieldType
  
  @js.native
  sealed trait file extends FieldType
  
  @js.native
  sealed trait geolocation extends FieldType
  
  @js.native
  sealed trait gridChoice extends FieldType
  
  @js.native
  sealed trait guid extends FieldType
  
  @js.native
  sealed trait integer extends FieldType
  
  @js.native
  sealed trait invalid extends FieldType
  
  @js.native
  sealed trait lookup extends FieldType
  
  @js.native
  sealed trait maxItems extends FieldType
  
  @js.native
  sealed trait modStat extends FieldType
  
  @js.native
  sealed trait multiChoice extends FieldType
  
  @js.native
  sealed trait note extends FieldType
  
  @js.native
  sealed trait number extends FieldType
  
  @js.native
  sealed trait outcomeChoice extends FieldType
  
  @js.native
  sealed trait pageSeparator extends FieldType
  
  @js.native
  sealed trait recurrence extends FieldType
  
  @js.native
  sealed trait text extends FieldType
  
  @js.native
  sealed trait threadIndex extends FieldType
  
  @js.native
  sealed trait threading extends FieldType
  
  @js.native
  sealed trait user extends FieldType
  
  @js.native
  sealed trait workflowEventType extends FieldType
  
  @js.native
  sealed trait workflowStatus extends FieldType
  
  /* 11 */ val URL: typings.sharepoint.SP.FieldType.URL with Double = js.native
  /* 29 */ val allDayEvent: typings.sharepoint.SP.FieldType.allDayEvent with Double = js.native
  /* 19 */ val attachments: typings.sharepoint.SP.FieldType.attachments with Double = js.native
  /* 8 */ val boolean: typings.sharepoint.SP.FieldType.boolean with Double = js.native
  /* 17 */ val calculated: typings.sharepoint.SP.FieldType.calculated with Double = js.native
  /* 6 */ val choice: typings.sharepoint.SP.FieldType.choice with Double = js.native
  /* 12 */ val computed: typings.sharepoint.SP.FieldType.computed with Double = js.native
  /* 25 */ val contentTypeId: typings.sharepoint.SP.FieldType.contentTypeId with Double = js.native
  /* 5 */ val counter: typings.sharepoint.SP.FieldType.counter with Double = js.native
  /* 22 */ val crossProjectLink: typings.sharepoint.SP.FieldType.crossProjectLink with Double = js.native
  /* 10 */ val currency: typings.sharepoint.SP.FieldType.currency with Double = js.native
  /* 4 */ val dateTime: typings.sharepoint.SP.FieldType.dateTime with Double = js.native
  /* 24 */ val error: typings.sharepoint.SP.FieldType.error with Double = js.native
  /* 18 */ val file: typings.sharepoint.SP.FieldType.file with Double = js.native
  /* 31 */ val geolocation: typings.sharepoint.SP.FieldType.geolocation with Double = js.native
  /* 16 */ val gridChoice: typings.sharepoint.SP.FieldType.gridChoice with Double = js.native
  /* 14 */ val guid: typings.sharepoint.SP.FieldType.guid with Double = js.native
  /* 1 */ val integer: typings.sharepoint.SP.FieldType.integer with Double = js.native
  /* 0 */ val invalid: typings.sharepoint.SP.FieldType.invalid with Double = js.native
  /* 7 */ val lookup: typings.sharepoint.SP.FieldType.lookup with Double = js.native
  /* 33 */ val maxItems: typings.sharepoint.SP.FieldType.maxItems with Double = js.native
  /* 23 */ val modStat: typings.sharepoint.SP.FieldType.modStat with Double = js.native
  /* 15 */ val multiChoice: typings.sharepoint.SP.FieldType.multiChoice with Double = js.native
  /* 3 */ val note: typings.sharepoint.SP.FieldType.note with Double = js.native
  /* 9 */ val number: typings.sharepoint.SP.FieldType.number with Double = js.native
  /* 32 */ val outcomeChoice: typings.sharepoint.SP.FieldType.outcomeChoice with Double = js.native
  /* 26 */ val pageSeparator: typings.sharepoint.SP.FieldType.pageSeparator with Double = js.native
  /* 21 */ val recurrence: typings.sharepoint.SP.FieldType.recurrence with Double = js.native
  /* 2 */ val text: typings.sharepoint.SP.FieldType.text with Double = js.native
  /* 27 */ val threadIndex: typings.sharepoint.SP.FieldType.threadIndex with Double = js.native
  /* 13 */ val threading: typings.sharepoint.SP.FieldType.threading with Double = js.native
  /* 20 */ val user: typings.sharepoint.SP.FieldType.user with Double = js.native
  /* 30 */ val workflowEventType: typings.sharepoint.SP.FieldType.workflowEventType with Double = js.native
  /* 28 */ val workflowStatus: typings.sharepoint.SP.FieldType.workflowStatus with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FieldType with Double] = js.native
}

