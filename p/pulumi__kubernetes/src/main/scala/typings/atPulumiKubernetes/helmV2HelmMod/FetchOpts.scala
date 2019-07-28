package typings.atPulumiKubernetes.helmV2HelmMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOpts extends js.Object {
  /** Verify certificates of HTTPS-enabled servers using this CA bundle. */
  var caFile: js.UndefOr[Input[String]] = js.undefined
  /** Identify HTTPS client using this SSL certificate file. */
  var certFile: js.UndefOr[Input[String]] = js.undefined
  /**
    * Location to write the chart. If this and tardir are specified, tardir is appended to this
    * (default ".").
    */
  var destination: js.UndefOr[Input[String]] = js.undefined
  /**
    * Use development versions, too. Equivalent to version '>0.0.0-0'. If --version is set, this is
    * ignored.
    */
  var devel: js.UndefOr[Input[Boolean]] = js.undefined
  /** Location of your Helm config. Overrides $HELM_HOME (default "/Users/alex/.helm"). */
  var home: js.UndefOr[Input[String]] = js.undefined
  /** Identify HTTPS client using this SSL key file. */
  var keyFile: js.UndefOr[Input[String]] = js.undefined
  /** Keyring containing public keys (default "/Users/alex/.gnupg/pubring.gpg"). */
  var keyring: js.UndefOr[Input[String]] = js.undefined
  /** Chart repository password. */
  var password: js.UndefOr[Input[String]] = js.undefined
  /** Fetch the provenance file, but don't perform verification. */
  var prov: js.UndefOr[Input[Boolean]] = js.undefined
  /** Chart repository url where to locate the requested chart. */
  var repo: js.UndefOr[Input[String]] = js.undefined
  /** If set to false, will leave the chart as a tarball after downloading. */
  var untar: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * If untar is specified, this flag specifies the name of the directory into which the chart is
    * expanded (default ".").
    */
  var untardir: js.UndefOr[Input[String]] = js.undefined
  /** Chart repository username. */
  var username: js.UndefOr[Input[String]] = js.undefined
  /** Verify the package against its signature. */
  var verify: js.UndefOr[Input[Boolean]] = js.undefined
  /** Specific version of a chart. Without this, the latest version is fetched. */
  var version: js.UndefOr[Input[String]] = js.undefined
}

object FetchOpts {
  @scala.inline
  def apply(
    caFile: Input[String] = null,
    certFile: Input[String] = null,
    destination: Input[String] = null,
    devel: Input[Boolean] = null,
    home: Input[String] = null,
    keyFile: Input[String] = null,
    keyring: Input[String] = null,
    password: Input[String] = null,
    prov: Input[Boolean] = null,
    repo: Input[String] = null,
    untar: Input[Boolean] = null,
    untardir: Input[String] = null,
    username: Input[String] = null,
    verify: Input[Boolean] = null,
    version: Input[String] = null
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

