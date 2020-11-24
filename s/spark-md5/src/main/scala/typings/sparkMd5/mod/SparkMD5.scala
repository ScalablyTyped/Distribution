package typings.sparkMd5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SparkMD5 extends js.Object {
  
  def append(str: String): SparkMD5 = js.native
  
  def appendBinary(contents: String): SparkMD5 = js.native
  
  def destroy(): Unit = js.native
  
  def end(): String = js.native
  def end(raw: Boolean): String = js.native
  
  def getState(): State = js.native
  
  def reset(): SparkMD5 = js.native
  
  def setState(state: State): State = js.native
}
