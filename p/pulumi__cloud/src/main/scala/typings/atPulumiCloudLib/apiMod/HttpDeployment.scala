package typings
package atPulumiCloudLib.apiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HttpDeployment extends js.Object {
  /**
       * An optional list of custom domain names, each corresponding to a
       * previous call to attachCustomDomain on the API.  Each name
       * should be mapped using a DNS A record.
       */
  var customDomainNames: js.Array[atPulumiPulumiLib.pulumiMod.Output[java.lang.String]]
  /**
       * The URL at which the HttpDeployment is available to the Internet.
       */
  var url: atPulumiPulumiLib.pulumiMod.Output[java.lang.String]
}

