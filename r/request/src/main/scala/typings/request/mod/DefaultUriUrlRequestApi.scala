package typings.request.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultUriUrlRequestApi[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions]
  extends StObject
     with RequestAPI[TRequest, TOptions, TUriUrlOptions] {
  
  def apply(): TRequest = js.native
  def apply(callback: RequestCallback): TRequest = js.native
  
  def del(): TRequest = js.native
  def del(callback: RequestCallback): TRequest = js.native
  
  def delete(): TRequest = js.native
  def delete(callback: RequestCallback): TRequest = js.native
  
  def get(): TRequest = js.native
  def get(callback: RequestCallback): TRequest = js.native
  
  def head(): TRequest = js.native
  def head(callback: RequestCallback): TRequest = js.native
  
  def patch(): TRequest = js.native
  def patch(callback: RequestCallback): TRequest = js.native
  
  def post(): TRequest = js.native
  def post(callback: RequestCallback): TRequest = js.native
  
  def put(): TRequest = js.native
  def put(callback: RequestCallback): TRequest = js.native
}
