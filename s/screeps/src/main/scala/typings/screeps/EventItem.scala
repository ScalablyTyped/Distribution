package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.screeps.AnonData
  - typings.screeps.AnonEvent
  - typings.screeps.AnonObjectId
  - typings.screeps.AnonDataEvent
  - typings.screeps.AnonEventObjectId
  - typings.screeps.AnonDataEventObjectId
  - typings.screeps.AnonEventEVENTREPAIR
  - typings.screeps.AnonEventEVENTRESERVECONTROLLER
  - typings.screeps.AnonEventEVENTUPGRADECONTROLLER
  - typings.screeps.AnonEventEVENTEXIT
  - typings.screeps.AnonEventEVENTPOWER
  - typings.screeps.AnonEventEVENTTRANSFER
*/
trait EventItem extends js.Object

object EventItem {
  @scala.inline
  def AnonData(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_ATTACK] */ js.Any,
    event: EVENT_ATTACK,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  @scala.inline
  def AnonEventEVENTREPAIR(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_REPAIR] */ js.Any,
    event: EVENT_REPAIR,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  @scala.inline
  def AnonEventEVENTRESERVECONTROLLER(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_RESERVE_CONTROLLER] */ js.Any,
    event: EVENT_RESERVE_CONTROLLER,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  @scala.inline
  def AnonDataEventObjectId(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_HEAL] */ js.Any,
    event: EVENT_HEAL,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  @scala.inline
  def AnonDataEvent(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_BUILD] */ js.Any,
    event: EVENT_BUILD,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  @scala.inline
  def AnonEvent(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_OBJECT_DESTROYED] */ js.Any,
    event: EVENT_OBJECT_DESTROYED,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  @scala.inline
  def AnonEventEVENTPOWER(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_POWER] */ js.Any,
    event: EVENT_POWER,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  @scala.inline
  def AnonEventObjectId(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_HARVEST] */ js.Any,
    event: EVENT_HARVEST,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  @scala.inline
  def AnonEventEVENTTRANSFER(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_TRANSFER] */ js.Any,
    event: EVENT_TRANSFER,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  @scala.inline
  def AnonEventEVENTUPGRADECONTROLLER(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_UPGRADE_CONTROLLER] */ js.Any,
    event: EVENT_UPGRADE_CONTROLLER,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  @scala.inline
  def AnonObjectId(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_ATTACK_CONTROLLER] */ js.Any,
    event: EVENT_ATTACK_CONTROLLER,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  @scala.inline
  def AnonEventEVENTEXIT(
    data: /* import warning: importer.ImportType#apply Failed type conversion: screeps.EventData[screeps.EVENT_EXIT] */ js.Any,
    event: EVENT_EXIT,
    objectId: String
  ): EventItem = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
}

