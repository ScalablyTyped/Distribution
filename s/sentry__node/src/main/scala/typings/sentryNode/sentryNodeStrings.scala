package typings.sentryNode

import typings.sentryNode.typesIntegrationsOnunhandledrejectionMod.UnhandledRejectionMode
import typings.sentryNode.typesRequestdataMod.TransactionNamingScheme
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
  sealed trait handler
    extends StObject
       with TransactionNamingScheme
  inline def handler: handler = "handler".asInstanceOf[handler]
  
  @js.native
  sealed trait methodPath
    extends StObject
       with TransactionNamingScheme
  inline def methodPath: methodPath = "methodPath".asInstanceOf[methodPath]
  
  @js.native
  sealed trait none
    extends StObject
       with UnhandledRejectionMode
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait path
    extends StObject
       with TransactionNamingScheme
  inline def path: path = "path".asInstanceOf[path]
  
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
