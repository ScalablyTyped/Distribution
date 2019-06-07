organization := "org.scalablytyped"
name := "request-as-curl"
version := "0.1-dt-20180502Z-de4272"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-ecc6d0",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-0917d3",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190412Z-a9f866",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-caf6a1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        