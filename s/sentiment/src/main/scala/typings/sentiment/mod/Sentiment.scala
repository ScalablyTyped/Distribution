package typings.sentiment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sentiment extends js.Object {
  
  def analyze(phrase: String): AnalysisResult = js.native
  def analyze(
    phrase: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ String, /* result */ AnalysisResult, Unit]
  ): AnalysisResult = js.native
  def analyze(phrase: String, options: AnalysisOptions): AnalysisResult = js.native
  def analyze(
    phrase: String,
    options: AnalysisOptions,
    callback: js.Function2[/* err */ String, /* result */ AnalysisResult, Unit]
  ): AnalysisResult = js.native
  
  def registerLanguage(languageCode: String, language: LanguageModule): Unit = js.native
}
