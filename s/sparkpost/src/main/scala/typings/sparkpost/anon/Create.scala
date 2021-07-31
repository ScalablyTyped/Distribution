package typings.sparkpost.anon

import typings.sparkpost.mod.Callback
import typings.sparkpost.mod.CreateOpts
import typings.sparkpost.mod.ResultsCallback
import typings.sparkpost.mod.ResultsPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Create extends StObject {
  
  /**
    * Create an inbound domain by providing an inbound domains object as the POST request body.
    * @param createOpts a hash of [inbound domain attributes]{@link https://developers.sparkpost.com/api/inbound-domains#header-inbound-domains-attributes}
    * @returns Promise void
    */
  def create(createOpts: CreateOpts): js.Promise[Unit] = js.native
  /**
    * Create an inbound domain by providing an inbound domains object as the POST request body.
    * @param createOpts a hash of [inbound domain attributes]{@link https://developers.sparkpost.com/api/inbound-domains#header-inbound-domains-attributes}
    * @param callback The request callback
    */
  def create(createOpts: CreateOpts, callback: Callback[Unit]): Unit = js.native
  
  /**
    * Delete an inbound domain by specifying its domain name in the URI path.
    * @param domain Domain name
    * @returns Promise void
    */
  def delete(domain: String): js.Promise[Unit] = js.native
  /**
    * Delete an inbound domain by specifying its domain name in the URI path.
    * @param domain Domain name
    * @param callback The request callback
    */
  def delete(domain: String, callback: Callback[Unit]): Unit = js.native
  
  /**
    * Retrieve an inbound domain by specifying its domain name in the URI path.
    * @param domain Domain name
    * @returns Promise The Domain results
    */
  def get(domain: String): ResultsPromise[typings.sparkpost.mod.Domain] = js.native
  /**
    * Retrieve an inbound domain by specifying its domain name in the URI path.
    * @param domain Domain name
    * @param callback The request callback with Domain results
    */
  def get(domain: String, callback: ResultsCallback[typings.sparkpost.mod.Domain]): Unit = js.native
  
  /**
    * List all your inbound domains.
    * @returns Promise The Domain results array
    */
  def list(): ResultsPromise[js.Array[typings.sparkpost.mod.Domain]] = js.native
  /**
    * List all your inbound domains.
    * @param callback The request callback with Domain results array
    */
  def list(callback: ResultsCallback[js.Array[typings.sparkpost.mod.Domain]]): Unit = js.native
}
