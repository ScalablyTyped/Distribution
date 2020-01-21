package typings.reactRequest

import typings.reactRequest.mod.ResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactRequestStrings {
  @js.native
  sealed trait arrayBuffer extends ResponseType
  
  @js.native
  sealed trait blob extends ResponseType
  
  @js.native
  sealed trait formData extends ResponseType
  
  @js.native
  sealed trait json extends ResponseType
  
  @js.native
  sealed trait text extends ResponseType
  
  @scala.inline
  def arrayBuffer: arrayBuffer = "arrayBuffer".asInstanceOf[arrayBuffer]
  @scala.inline
  def blob: blob = "blob".asInstanceOf[blob]
  @scala.inline
  def formData: formData = "formData".asInstanceOf[formData]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
}

