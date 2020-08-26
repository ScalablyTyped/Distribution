package typings.pulumiAws.mod

import typings.pulumiAws.getOutpostInstanceTypeMod.GetOutpostInstanceTypeArgs
import typings.pulumiAws.getOutpostInstanceTypeMod.GetOutpostInstanceTypeResult
import typings.pulumiAws.getOutpostInstanceTypesMod.GetOutpostInstanceTypesArgs
import typings.pulumiAws.getOutpostInstanceTypesMod.GetOutpostInstanceTypesResult
import typings.pulumiAws.getOutpostMod.GetOutpostArgs
import typings.pulumiAws.getOutpostMod.GetOutpostResult
import typings.pulumiAws.getOutpostsMod.GetOutpostsArgs
import typings.pulumiAws.getOutpostsMod.GetOutpostsResult
import typings.pulumiAws.getSiteMod.GetSiteArgs
import typings.pulumiAws.getSiteMod.GetSiteResult
import typings.pulumiAws.getSitesMod.GetSitesResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "outposts")
@js.native
object outposts extends js.Object {
  def getOutpost(): js.Promise[GetOutpostResult] = js.native
  def getOutpost(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetOutpostResult] = js.native
  def getOutpost(args: GetOutpostArgs): js.Promise[GetOutpostResult] = js.native
  def getOutpost(args: GetOutpostArgs, opts: InvokeOptions): js.Promise[GetOutpostResult] = js.native
  def getOutpostInstanceType(args: GetOutpostInstanceTypeArgs): js.Promise[GetOutpostInstanceTypeResult] = js.native
  def getOutpostInstanceType(args: GetOutpostInstanceTypeArgs, opts: InvokeOptions): js.Promise[GetOutpostInstanceTypeResult] = js.native
  def getOutpostInstanceTypes(args: GetOutpostInstanceTypesArgs): js.Promise[GetOutpostInstanceTypesResult] = js.native
  def getOutpostInstanceTypes(args: GetOutpostInstanceTypesArgs, opts: InvokeOptions): js.Promise[GetOutpostInstanceTypesResult] = js.native
  def getOutposts(): js.Promise[GetOutpostsResult] = js.native
  def getOutposts(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetOutpostsResult] = js.native
  def getOutposts(args: GetOutpostsArgs): js.Promise[GetOutpostsResult] = js.native
  def getOutposts(args: GetOutpostsArgs, opts: InvokeOptions): js.Promise[GetOutpostsResult] = js.native
  def getSite(): js.Promise[GetSiteResult] = js.native
  def getSite(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSiteResult] = js.native
  def getSite(args: GetSiteArgs): js.Promise[GetSiteResult] = js.native
  def getSite(args: GetSiteArgs, opts: InvokeOptions): js.Promise[GetSiteResult] = js.native
  def getSites(): js.Promise[GetSitesResult] = js.native
  def getSites(opts: InvokeOptions): js.Promise[GetSitesResult] = js.native
}

