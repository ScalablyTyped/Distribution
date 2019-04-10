package typings
package atPulumiKubernetesLib.helmV2HelmMod

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

object FetchOpts {
  @scala.inline
  def apply(
    caFile: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    certFile: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    destination: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    devel: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    home: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    keyFile: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    keyring: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    password: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    prov: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    repo: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    untar: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    untardir: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    username: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    verify: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    version: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): FetchOpts = {
    val __obj = js.Dynamic.literal()
    if (caFile != null) __obj.updateDynamic("caFile")(caFile.asInstanceOf[js.Any])
    if (certFile != null) __obj.updateDynamic("certFile")(certFile.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (devel != null) __obj.updateDynamic("devel")(devel.asInstanceOf[js.Any])
    if (home != null) __obj.updateDynamic("home")(home.asInstanceOf[js.Any])
    if (keyFile != null) __obj.updateDynamic("keyFile")(keyFile.asInstanceOf[js.Any])
    if (keyring != null) __obj.updateDynamic("keyring")(keyring.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (prov != null) __obj.updateDynamic("prov")(prov.asInstanceOf[js.Any])
    if (repo != null) __obj.updateDynamic("repo")(repo.asInstanceOf[js.Any])
    if (untar != null) __obj.updateDynamic("untar")(untar.asInstanceOf[js.Any])
    if (untardir != null) __obj.updateDynamic("untardir")(untardir.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (verify != null) __obj.updateDynamic("verify")(verify.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchOpts]
  }
}

