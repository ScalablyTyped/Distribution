package typings.atPulumiAws.typesInputMod.fsxNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsFileSystemSelfManagedActiveDirectory extends js.Object {
  /**
    * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory. The IP addresses need to be either in the same VPC CIDR range as the file system or in the private IP version 4 (IPv4) address ranges as specified in [RFC 1918](https://tools.ietf.org/html/rfc1918).
    */
  var dnsIps: Input[js.Array[Input[String]]]
  /**
    * The fully qualified domain name of the self-managed AD directory. For example, `corp.example.com`.
    */
  var domainName: Input[String]
  /**
    * The name of the domain group whose members are granted administrative privileges for the file system. Administrative privileges include taking ownership of files and folders, and setting audit controls (audit ACLs) on files and folders. The group that you specify must already exist in your domain. Defaults to `Domain Admins`.
    */
  var fileSystemAdministratorsGroup: js.UndefOr[Input[String]] = js.undefined
  /**
    * The fully qualified distinguished name of the organizational unit within your self-managed AD directory that the Windows File Server instance will join. For example, `OU=FSx,DC=yourdomain,DC=corp,DC=com`. Only accepts OU as the direct parent of the file system. If none is provided, the FSx file system is created in the default location of your self-managed AD directory. To learn more, see [RFC 2253](https://tools.ietf.org/html/rfc2253).
    */
  var organizationalUnitDistinguishedName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
    */
  var password: Input[String]
  /**
    * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
    */
  var username: Input[String]
}

object WindowsFileSystemSelfManagedActiveDirectory {
  @scala.inline
  def apply(
    dnsIps: Input[js.Array[Input[String]]],
    domainName: Input[String],
    password: Input[String],
    username: Input[String],
    fileSystemAdministratorsGroup: Input[String] = null,
    organizationalUnitDistinguishedName: Input[String] = null
  ): WindowsFileSystemSelfManagedActiveDirectory = {
    val __obj = js.Dynamic.literal(dnsIps = dnsIps.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (fileSystemAdministratorsGroup != null) __obj.updateDynamic("fileSystemAdministratorsGroup")(fileSystemAdministratorsGroup.asInstanceOf[js.Any])
    if (organizationalUnitDistinguishedName != null) __obj.updateDynamic("organizationalUnitDistinguishedName")(organizationalUnitDistinguishedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsFileSystemSelfManagedActiveDirectory]
  }
}

