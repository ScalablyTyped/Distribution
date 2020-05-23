package typings.snykDockerPlugin.analyzerTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnalysisType extends js.Object

@JSImport("snyk-docker-plugin/dist/analyzer/types", "AnalysisType")
@js.native
object AnalysisType extends js.Object {
  @js.native
  sealed trait Apk extends AnalysisType
  
  @js.native
  sealed trait Apt extends AnalysisType
  
  @js.native
  sealed trait Binaries extends AnalysisType
  
  @js.native
  sealed trait Linux extends AnalysisType
  
  @js.native
  sealed trait Rpm extends AnalysisType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AnalysisType with String] = js.native
  /* "Apk" */ @js.native
  object Apk extends TopLevel[Apk with String]
  
  /* "Apt" */ @js.native
  object Apt extends TopLevel[Apt with String]
  
  /* "binaries" */ @js.native
  object Binaries extends TopLevel[Binaries with String]
  
  /* "linux" */ @js.native
  object Linux extends TopLevel[Linux with String]
  
  /* "Rpm" */ @js.native
  object Rpm extends TopLevel[Rpm with String]
  
}

