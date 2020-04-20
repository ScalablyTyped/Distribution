package typings.serverless

import typings.serverless.validateMod.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object serverlessStrings {
  @js.native
  sealed trait any extends HttpMethod
  
  @js.native
  sealed trait delete extends HttpMethod
  
  @js.native
  sealed trait get extends HttpMethod
  
  @js.native
  sealed trait head extends HttpMethod
  
  @js.native
  sealed trait options extends HttpMethod
  
  @js.native
  sealed trait patch extends HttpMethod
  
  @js.native
  sealed trait post extends HttpMethod
  
  @js.native
  sealed trait put extends HttpMethod
  
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  @scala.inline
  def get: get = "get".asInstanceOf[get]
  @scala.inline
  def head: head = "head".asInstanceOf[head]
  @scala.inline
  def options: options = "options".asInstanceOf[options]
  @scala.inline
  def patch: patch = "patch".asInstanceOf[patch]
  @scala.inline
  def post: post = "post".asInstanceOf[post]
  @scala.inline
  def put: put = "put".asInstanceOf[put]
}

