package typings.speedMeasureWebpackPlugin

import typings.speedMeasureWebpackPlugin.mod._OutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object speedMeasureWebpackPluginStrings {
  
  @scala.inline
  def human: human = "human".asInstanceOf[human]
  
  @scala.inline
  def humanVerbose: humanVerbose = "humanVerbose".asInstanceOf[humanVerbose]
  
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait human extends _OutputFormat
  
  @js.native
  sealed trait humanVerbose extends _OutputFormat
  
  @js.native
  sealed trait json extends _OutputFormat
}
