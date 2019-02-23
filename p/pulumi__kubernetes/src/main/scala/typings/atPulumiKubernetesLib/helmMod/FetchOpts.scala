package typings
package atPulumiKubernetesLib.helmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOpts extends js.Object {
  /** Verify certificates of HTTPS-enabled servers using this CA bundle. */
  var caFile: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /** Identify HTTPS client using this SSL certificate file. */
  var certFile: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Location to write the chart. If this and tardir are specified, tardir is appended to this
    * (default ".").
    */
  var destination: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Use development versions, too. Equivalent to version '>0.0.0-0'. If --version is set, this is
    * ignored.
    */
  var devel: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /** Location of your Helm config. Overrides $HELM_HOME (default "/Users/alex/.helm"). */
  var home: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /** Identify HTTPS client using this SSL key file. */
  var keyFile: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /** Keyring containing public keys (default "/Users/alex/.gnupg/pubring.gpg"). */
  var keyring: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /** Chart repository password. */
  var password: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /** Fetch the provenance file, but don't perform verification. */
  var prov: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /** Chart repository url where to locate the requested chart. */
  var repo: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /** If set to false, will leave the chart as a tarball after downloading. */
  var untar: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * If untar is specified, this flag specifies the name of the directory into which the chart is
    * expanded (default ".").
    */
  var untardir: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /** Chart repository username. */
  var username: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /** Verify the package against its signature. */
  var verify: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /** Specific version of a chart. Without this, the latest version is fetched. */
  var version: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

