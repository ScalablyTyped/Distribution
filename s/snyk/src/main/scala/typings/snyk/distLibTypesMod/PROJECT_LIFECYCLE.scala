package typings.snyk.distLibTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PROJECT_LIFECYCLE extends StObject
@JSImport("snyk/dist/lib/types", "PROJECT_LIFECYCLE")
@js.native
object PROJECT_LIFECYCLE extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PROJECT_LIFECYCLE & String] = js.native
  
  @js.native
  sealed trait DEVELOPMENT
    extends StObject
       with PROJECT_LIFECYCLE
  /* "development" */ val DEVELOPMENT: typings.snyk.distLibTypesMod.PROJECT_LIFECYCLE.DEVELOPMENT & String = js.native
  
  @js.native
  sealed trait PRODUCTION
    extends StObject
       with PROJECT_LIFECYCLE
  /* "production" */ val PRODUCTION: typings.snyk.distLibTypesMod.PROJECT_LIFECYCLE.PRODUCTION & String = js.native
  
  @js.native
  sealed trait SANDBOX
    extends StObject
       with PROJECT_LIFECYCLE
  /* "sandbox" */ val SANDBOX: typings.snyk.distLibTypesMod.PROJECT_LIFECYCLE.SANDBOX & String = js.native
}
