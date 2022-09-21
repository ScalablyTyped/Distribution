package typings.remixRunRouter.utilsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResultType extends StObject
@JSImport("@remix-run/router/dist/utils", "ResultType")
@js.native
object ResultType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ResultType & String] = js.native
  
  @js.native
  sealed trait data
    extends StObject
       with ResultType
  /* "data" */ val data: typings.remixRunRouter.utilsMod.ResultType.data & String = js.native
  
  @js.native
  sealed trait deferred
    extends StObject
       with ResultType
  /* "deferred" */ val deferred: typings.remixRunRouter.utilsMod.ResultType.deferred & String = js.native
  
  @js.native
  sealed trait error
    extends StObject
       with ResultType
  /* "error" */ val error: typings.remixRunRouter.utilsMod.ResultType.error & String = js.native
  
  @js.native
  sealed trait redirect
    extends StObject
       with ResultType
  /* "redirect" */ val redirect: typings.remixRunRouter.utilsMod.ResultType.redirect & String = js.native
}
