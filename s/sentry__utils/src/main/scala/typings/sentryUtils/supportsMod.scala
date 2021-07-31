package typings.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object supportsMod {
  
  @JSImport("@sentry/utils/dist/supports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def supportsDOMError(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsDOMError")().asInstanceOf[Boolean]
  
  @scala.inline
  def supportsDOMException(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsDOMException")().asInstanceOf[Boolean]
  
  @scala.inline
  def supportsErrorEvent(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsErrorEvent")().asInstanceOf[Boolean]
  
  @scala.inline
  def supportsFetch(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsFetch")().asInstanceOf[Boolean]
  
  @scala.inline
  def supportsHistory(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsHistory")().asInstanceOf[Boolean]
  
  @scala.inline
  def supportsNativeFetch(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsNativeFetch")().asInstanceOf[Boolean]
  
  @scala.inline
  def supportsReferrerPolicy(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsReferrerPolicy")().asInstanceOf[Boolean]
  
  @scala.inline
  def supportsReportingObserver(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsReportingObserver")().asInstanceOf[Boolean]
}
