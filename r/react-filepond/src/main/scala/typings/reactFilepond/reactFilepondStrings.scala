package typings.reactFilepond

import typings.reactFilepond.mod.FilePondOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactFilepondStrings {
  @js.native
  sealed trait DELETE extends js.Object
  
  @js.native
  sealed trait GET extends js.Object
  
  @js.native
  sealed trait POST extends js.Object
  
  @js.native
  sealed trait PUT extends js.Object
  
  @js.native
  sealed trait input extends FilePondOrigin
  
  @js.native
  sealed trait limbo extends FilePondOrigin
  
  @js.native
  sealed trait local extends FilePondOrigin
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  @scala.inline
  def input: input = "input".asInstanceOf[input]
  @scala.inline
  def limbo: limbo = "limbo".asInstanceOf[limbo]
  @scala.inline
  def local: local = "local".asInstanceOf[local]
}

