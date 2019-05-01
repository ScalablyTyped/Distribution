organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20190322Z-89c32b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20190418Z-285438",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-f7c283",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-3c30b2",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20190330Z-17a04c",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        