organization := "org.scalablytyped"
name := "request-promise"
version := "4.1-dt-20190423Z-819415"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-e9bc8b",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-37ce53",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-ad609a",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190422Z-40afee",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190412Z-bab93c",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-36601b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        