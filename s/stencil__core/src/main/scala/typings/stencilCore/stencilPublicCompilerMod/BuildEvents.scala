package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildEvents
  extends StObject
     with BuildOnEvents
     with BuildEmitEvents {
  
  def unsubscribeAll(): Unit = js.native
}
