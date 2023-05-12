package typings.stagehand

import typings.stagehand.libUtilsDeferMod.DeferredState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stagehandStrings {
  
  @js.native
  sealed trait pending
    extends StObject
       with DeferredState
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait rejected
    extends StObject
       with DeferredState
  inline def rejected: rejected = "rejected".asInstanceOf[rejected]
  
  @js.native
  sealed trait resolved
    extends StObject
       with DeferredState
  inline def resolved: resolved = "resolved".asInstanceOf[resolved]
}
