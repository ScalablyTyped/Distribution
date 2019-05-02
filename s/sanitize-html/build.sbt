organization := "org.scalablytyped"
name := "sanitize-html"
version := "1.18.2-dt-20190326Z-a5fc5a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "domhandler" % "2.4-dt-20190326Z-5a07cb",
  "org.scalablytyped" %%% "domutils" % "1.7-dt-20190326Z-2635ee",
  "org.scalablytyped" %%% "htmlparser2" % "v3.10.x-dt-20190326Z-11eb3c",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-d681c7",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        