package typings.simplestorageJs

import typings.simplestorageJs.mod.simplestoragejs.StatusCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simplestorageJsStrings {
  
  @js.native
  sealed trait LS_DISABLED
    extends StObject
       with StatusCode
  inline def LS_DISABLED: LS_DISABLED = "LS_DISABLED".asInstanceOf[LS_DISABLED]
  
  @js.native
  sealed trait LS_NOT_AVAILABLE
    extends StObject
       with StatusCode
  inline def LS_NOT_AVAILABLE: LS_NOT_AVAILABLE = "LS_NOT_AVAILABLE".asInstanceOf[LS_NOT_AVAILABLE]
  
  @js.native
  sealed trait LS_QUOTA_EXCEEDED
    extends StObject
       with StatusCode
  inline def LS_QUOTA_EXCEEDED: LS_QUOTA_EXCEEDED = "LS_QUOTA_EXCEEDED".asInstanceOf[LS_QUOTA_EXCEEDED]
  
  @js.native
  sealed trait OK
    extends StObject
       with StatusCode
  inline def OK: OK = "OK".asInstanceOf[OK]
}
