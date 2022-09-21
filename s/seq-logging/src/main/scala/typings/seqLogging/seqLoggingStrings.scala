package typings.seqLogging

import typings.seqLogging.mod.SeqLogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object seqLoggingStrings {
  
  @js.native
  sealed trait Debug
    extends StObject
       with SeqLogLevel
  inline def Debug: Debug = "Debug".asInstanceOf[Debug]
  
  @js.native
  sealed trait Error
    extends StObject
       with SeqLogLevel
  inline def Error: Error = "Error".asInstanceOf[Error]
  
  @js.native
  sealed trait Fatal
    extends StObject
       with SeqLogLevel
  inline def Fatal: Fatal = "Fatal".asInstanceOf[Fatal]
  
  @js.native
  sealed trait Information
    extends StObject
       with SeqLogLevel
  inline def Information: Information = "Information".asInstanceOf[Information]
  
  @js.native
  sealed trait Verbose
    extends StObject
       with SeqLogLevel
  inline def Verbose: Verbose = "Verbose".asInstanceOf[Verbose]
  
  @js.native
  sealed trait Warning
    extends StObject
       with SeqLogLevel
  inline def Warning: Warning = "Warning".asInstanceOf[Warning]
}
