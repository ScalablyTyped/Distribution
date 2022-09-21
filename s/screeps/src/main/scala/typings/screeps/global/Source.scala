package typings.screeps.global

import typings.screeps.Id
import typings.screeps.RoomObjectEffect
import typings.screeps.SourceConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Source")
@js.native
open class Source protected ()
  extends StObject
     with typings.screeps.Source {
  def this(id: Id[typings.screeps.Source]) = this()
  
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  var effects: js.Array[RoomObjectEffect] = js.native
  
  /**
    * The remaining amount of energy.
    */
  /* CompleteClass */
  var energy: Double = js.native
  
  /**
    * The total amount of energy in the source. Equals to 3000 in most cases.
    */
  /* CompleteClass */
  var energyCapacity: Double = js.native
  
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  /* CompleteClass */
  var id: Id[this.type] = js.native
  
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  var pos: typings.screeps.RoomPosition = js.native
  
  /**
    * If you can get an instance of Source, you can see it.
    * If you can see a Source, you can see the room it's in.
    */
  /* CompleteClass */
  @JSName("room")
  var room_Source: typings.screeps.Room = js.native
  
  /**
    * The remaining time after which the source will be refilled.
    */
  /* CompleteClass */
  var ticksToRegeneration: Double = js.native
}
object Source {
  
  inline def apply: SourceConstructor = js.Dynamic.global.selectDynamic("Source").asInstanceOf[SourceConstructor]
}
