package typings.rnFetchBlob

import typings.rnFetchBlob.mod.Encoding
import typings.rnFetchBlob.mod.Methods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rnFetchBlobStrings {
  @js.native
  sealed trait DELETE extends Methods
  
  @js.native
  sealed trait GET extends Methods
  
  @js.native
  sealed trait POST extends Methods
  
  @js.native
  sealed trait PUT extends Methods
  
  @js.native
  sealed trait _empty extends js.Object
  
  @js.native
  sealed trait ascii extends Encoding
  
  @js.native
  sealed trait base64 extends Encoding
  
  @js.native
  sealed trait blob extends js.Object
  
  @js.native
  sealed trait delete_ extends Methods
  
  @js.native
  sealed trait directory extends js.Object
  
  @js.native
  sealed trait file extends js.Object
  
  @js.native
  sealed trait get_ extends Methods
  
  @js.native
  sealed trait json extends js.Object
  
  @js.native
  sealed trait path extends js.Object
  
  @js.native
  sealed trait post_ extends Methods
  
  @js.native
  sealed trait put_ extends Methods
  
  @js.native
  sealed trait text extends js.Object
  
  @js.native
  sealed trait utf8 extends Encoding
  
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  @scala.inline
  def ascii: ascii = "ascii".asInstanceOf[ascii]
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def blob: blob = "blob".asInstanceOf[blob]
  @scala.inline
  def delete_ : delete_ = "delete".asInstanceOf[delete_]
  @scala.inline
  def directory: directory = "directory".asInstanceOf[directory]
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  @scala.inline
  def get_ : get_ = "get".asInstanceOf[get_]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def path: path = "path".asInstanceOf[path]
  @scala.inline
  def post_ : post_ = "post".asInstanceOf[post_]
  @scala.inline
  def put_ : put_ = "put".asInstanceOf[put_]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}

