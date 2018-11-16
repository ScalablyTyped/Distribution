package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * HTTPGetAction describes an action based on HTTP Get requests.
         */

trait HTTPGetAction extends js.Object {
  /**
               * Host name to connect to, defaults to the pod IP. You probably want to set "Host" in
               * httpHeaders instead.
               */
  val host: java.lang.String
  /**
               * Custom headers to set in the request. HTTP allows repeated headers.
               */
  val httpHeaders: js.Array[HTTPHeader]
  /**
               * Path to access on the HTTP server.
               */
  val path: java.lang.String
  /**
               * Name or number of the port to access on the container. Number must be in the range 1 to
               * 65535. Name must be an IANA_SVC_NAME.
               */
  val port: scala.Double | java.lang.String
  /**
               * Scheme to use for connecting to the host. Defaults to HTTP.
               */
  val scheme: java.lang.String
}

