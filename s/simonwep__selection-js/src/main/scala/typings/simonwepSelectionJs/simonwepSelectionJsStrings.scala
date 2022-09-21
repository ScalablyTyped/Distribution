package typings.simonwepSelectionJs

import typings.simonwepSelectionJs.mod.Intersection
import typings.simonwepSelectionJs.mod.OverlapMode
import typings.simonwepSelectionJs.mod.TapMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simonwepSelectionJsStrings {
  
  @js.native
  sealed trait beforestart extends StObject
  inline def beforestart: beforestart = "beforestart".asInstanceOf[beforestart]
  
  @js.native
  sealed trait center
    extends StObject
       with Intersection
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait cover
    extends StObject
       with Intersection
  inline def cover: cover = "cover".asInstanceOf[cover]
  
  @js.native
  sealed trait drop
    extends StObject
       with OverlapMode
  inline def drop: drop = "drop".asInstanceOf[drop]
  
  @js.native
  sealed trait invert
    extends StObject
       with OverlapMode
  inline def invert: invert = "invert".asInstanceOf[invert]
  
  @js.native
  sealed trait keep
    extends StObject
       with OverlapMode
  inline def keep: keep = "keep".asInstanceOf[keep]
  
  @js.native
  sealed trait move extends StObject
  inline def move: move = "move".asInstanceOf[move]
  
  @js.native
  sealed trait native
    extends StObject
       with TapMode
  inline def native: native = "native".asInstanceOf[native]
  
  @js.native
  sealed trait start extends StObject
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait stop extends StObject
  inline def stop: stop = "stop".asInstanceOf[stop]
  
  @js.native
  sealed trait touch
    extends StObject
       with Intersection
       with TapMode
  inline def touch: touch = "touch".asInstanceOf[touch]
}
