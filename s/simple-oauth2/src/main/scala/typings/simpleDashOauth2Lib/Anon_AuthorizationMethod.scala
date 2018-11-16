package typings
package simpleDashOauth2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_AuthorizationMethod extends js.Object {
  /**
           * Indicates the method used to send the client.id/client.secret authorization params at the token request.
           * If set to body, the bodyFormat option will be used to format the credentials.
           * Defaults to header
           */
  var authorizationMethod: js.UndefOr[
    simpleDashOauth2Lib.simpleDashOauth2LibStrings.header | simpleDashOauth2Lib.simpleDashOauth2LibStrings.body
  ] = js.undefined
  /** Format of data sent in the request body. Defaults to form. */
  var bodyFormat: js.UndefOr[
    simpleDashOauth2Lib.simpleDashOauth2LibStrings.json | simpleDashOauth2Lib.simpleDashOauth2LibStrings.form
  ] = js.undefined
}

