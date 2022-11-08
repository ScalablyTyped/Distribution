package typings.proggy

import typings.proggy.mod.ClientEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proggyStrings {
  
  @js.native
  sealed trait bar
    extends StObject
       with ClientEvent
  inline def bar: bar = "bar".asInstanceOf[bar]
  
  @js.native
  sealed trait barDone
    extends StObject
       with ClientEvent
  inline def barDone: barDone = "barDone".asInstanceOf[barDone]
  
  @js.native
  sealed trait done
    extends StObject
       with ClientEvent
  inline def done: done = "done".asInstanceOf[done]
  
  @js.native
  sealed trait progress
    extends StObject
       with ClientEvent
  inline def progress: progress = "progress".asInstanceOf[progress]
}
