package typings.screepsArena

import typings.screepsArena.arenaPrototypesMod.BodyPartConstructor
import typings.screepsArena.arenaPrototypesMod.FlagConstructor
import typings.screepsArena.gamePrototypesMod.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arenaMod {
  
  @JSImport("arena", "BodyPart")
  @js.native
  val BodyPart: BodyPartConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("arena", "BodyPart")
  @js.native
  open class BodyPartCls ()
    extends StObject
       with typings.screepsArena.arenaPrototypesMod.BodyPart {
    def this(id: Id[typings.screepsArena.arenaPrototypesMod.BodyPart]) = this()
    
    /**
      * X position in the room. Can be undefined if `.exists` is false
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * Y position in the room. Can be undefined if `.exists` is false
      */
    /* CompleteClass */
    var y: Double = js.native
  }
  
  @JSImport("arena", "Flag")
  @js.native
  val Flag: FlagConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("arena", "Flag")
  @js.native
  open class FlagCls ()
    extends StObject
       with typings.screepsArena.arenaPrototypesMod.Flag {
    def this(id: Id[typings.screepsArena.arenaPrototypesMod.Flag]) = this()
    
    /**
      * X position in the room. Can be undefined if `.exists` is false
      */
    /* CompleteClass */
    var x: Double = js.native
    
    /**
      * Y position in the room. Can be undefined if `.exists` is false
      */
    /* CompleteClass */
    var y: Double = js.native
  }
}
