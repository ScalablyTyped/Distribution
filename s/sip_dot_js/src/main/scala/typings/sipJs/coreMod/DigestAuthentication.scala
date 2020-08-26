package typings.sipJs.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "DigestAuthentication")
@js.native
class DigestAuthentication protected ()
  extends typings.sipJs.messagesMod.DigestAuthentication {
  /**
    * Constructor.
    * @param loggerFactory - LoggerFactory.
    * @param username - Username.
    * @param password - Password.
    */
  def this(loggerFactory: typings.sipJs.logMod.LoggerFactory) = this()
  def this(loggerFactory: typings.sipJs.logMod.LoggerFactory, ha1: String) = this()
  def this(
    loggerFactory: typings.sipJs.logMod.LoggerFactory,
    ha1: js.UndefOr[scala.Nothing],
    username: String
  ) = this()
  def this(loggerFactory: typings.sipJs.logMod.LoggerFactory, ha1: String, username: String) = this()
  def this(
    loggerFactory: typings.sipJs.logMod.LoggerFactory,
    ha1: js.UndefOr[scala.Nothing],
    username: js.UndefOr[scala.Nothing],
    password: String
  ) = this()
  def this(
    loggerFactory: typings.sipJs.logMod.LoggerFactory,
    ha1: js.UndefOr[scala.Nothing],
    username: String,
    password: String
  ) = this()
  def this(
    loggerFactory: typings.sipJs.logMod.LoggerFactory,
    ha1: String,
    username: js.UndefOr[scala.Nothing],
    password: String
  ) = this()
  def this(loggerFactory: typings.sipJs.logMod.LoggerFactory, ha1: String, username: String, password: String) = this()
}

