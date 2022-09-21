package typings.sentryNode

import typings.sentryNode.onunhandledrejectionMod.UnhandledRejectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sentryNodeStrings {
  
  @js.native
  sealed trait data extends StObject
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait end extends StObject
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait none
    extends StObject
       with UnhandledRejectionMode
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait strict
    extends StObject
       with UnhandledRejectionMode
  inline def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait warn
    extends StObject
       with UnhandledRejectionMode
  inline def warn: warn = "warn".asInstanceOf[warn]
}
