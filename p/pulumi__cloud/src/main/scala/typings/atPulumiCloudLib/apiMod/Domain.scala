package typings
package atPulumiCloudLib.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Domain extends js.Object {
  /**
       * An SSL/TLS certficicate issued for this domain (`cert.pem`).
       */
  var certificateBody: java.lang.String
  /**
       * The certificate chain for the SSL/TLS certificate provided for this
       * domain (`chain.pem`).
       */
  var certificateChain: java.lang.String
  /**
       * An SSL/TLS private key issued for thie domain (`privkey.pem`).
       */
  var certificatePrivateKey: java.lang.String
  /**
       * The domain name to associate with the API.
       */
  var domainName: java.lang.String
}

