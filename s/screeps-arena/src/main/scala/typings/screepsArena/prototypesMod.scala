package typings.screepsArena

import typings.screepsArena.constantsMod.BodyPartConstant
import typings.screepsArena.gamePrototypesMod.ConstructorById
import typings.screepsArena.gamePrototypesMod.GameObject
import typings.screepsArena.gamePrototypesMod.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prototypesMod {
  
  @js.native
  trait BodyPart
    extends StObject
       with GameObject {
    
    /**
      * The number of ticks until this item disappears.
      */
    var ticksToDecay: Double = js.native
    
    /**
      * The type of the body part.
      */
    var `type`: BodyPartConstant = js.native
  }
  @JSImport("arena/prototypes", "BodyPart")
  @js.native
  val BodyPart: BodyPartConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("arena/prototypes", "BodyPart")
  @js.native
  open class BodyPartCls ()
    extends StObject
       with typings.screepsArena.prototypesMod.BodyPart {
    def this(id: Id[typings.screepsArena.prototypesMod.BodyPart]) = this()
    
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
  
  @js.native
  trait Flag
    extends StObject
       with GameObject {
    
    /**
      * Equals to true or false if the flag is owned.
      * Returns undefined if it is neutral.
      */
    var my: js.UndefOr[Boolean] = js.native
  }
  @JSImport("arena/prototypes", "Flag")
  @js.native
  val Flag: FlagConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("arena/prototypes", "Flag")
  @js.native
  open class FlagCls ()
    extends StObject
       with typings.screepsArena.prototypesMod.Flag {
    def this(id: Id[typings.screepsArena.prototypesMod.Flag]) = this()
    
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
  
  @js.native
  trait BodyPartConstructor
    extends StObject
       with ConstructorById[typings.screepsArena.prototypesMod.BodyPart]
  
  @js.native
  trait FlagConstructor
    extends StObject
       with ConstructorById[typings.screepsArena.prototypesMod.Flag]
}
