package typings
package atPulumiKubernetesLib.typesOutputMod.apiregistrationNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * APIServiceSpec contains information for locating and communicating with a server. Only https
         * is supported, though you are able to disable certificate verification.
         */

trait APIServiceSpec extends js.Object {
  /**
               * CABundle is a PEM encoded CA bundle which will be used to validate an API server's serving
               * certificate.
               */
  val caBundle: java.lang.String
  /**
               * Group is the API group name this server hosts
               */
  val group: java.lang.String
  /**
               * GroupPriorityMininum is the priority this group should have at least. Higher priority means
               * that the group is preferred by clients over lower priority ones. Note that other versions
               * of this group might specify even higher GroupPriorityMininum values such that the whole
               * group gets a higher priority. The primary sort is based on GroupPriorityMinimum, ordered
               * highest number to lowest (20 before 10). The secondary sort is based on the alphabetical
               * comparison of the name of the object.  (v1.bar before v1.foo) We'd recommend something
               * like: *.k8s.io (except extensions) at 18000 and PaaSes (OpenShift, Deis) are recommended to
               * be in the 2000s
               */
  val groupPriorityMinimum: scala.Double
  /**
               * InsecureSkipTLSVerify disables TLS certificate verification when communicating with this
               * server. This is strongly discouraged.  You should use the CABundle instead.
               */
  val insecureSkipTLSVerify: scala.Boolean
  /**
               * Service is a reference to the service for this API server.  It must communicate on port 443
               * If the Service is nil, that means the handling for the API groupversion is handled locally
               * on this server. The call will simply delegate to the normal handler chain to be fulfilled.
               */
  val service: ServiceReference
  /**
               * Version is the API version this server hosts.  For example, "v1"
               */
  val version: java.lang.String
  /**
               * VersionPriority controls the ordering of this API version inside of its group.  Must be
               * greater than zero. The primary sort is based on VersionPriority, ordered highest to lowest
               * (20 before 10). The secondary sort is based on the alphabetical comparison of the name of
               * the object.  (v1.bar before v1.foo) Since it's inside of a group, the number can be small,
               * probably in the 10s.
               */
  val versionPriority: scala.Double
}

